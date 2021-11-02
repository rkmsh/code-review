import java.util.*;

class Library
{
    
    String bookName;
    String author;
    Library()
    {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.bookName);
        hash = 83 * hash + Objects.hashCode(this.author);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Library other = (Library) obj;
        if (!Objects.equals(this.bookName, other.bookName)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }
    
    
    Library(String bookName,String author)
    {
        this.bookName=bookName;
        this.author=author;
    }
    public HashMap<Integer,Library> createLibraryMap(String booksInLibrary)
    {
        String output = booksInLibrary.replace("|",":");
        HashMap<Integer, Library> hmap= new HashMap<Integer, Library>();
        String parts1[] = output.split(":");
        for(String part : parts1) {
          String lib[] = part.split(",");
          int bid=Integer.parseInt(lib[0]); 
          String bname = lib[1].trim();
          String bauthor = lib[2].trim();
          Library l=new Library(bname,bauthor);
          hmap.put(bid,l);
        }
        return hmap;
    
    }
    public HashMap<Integer,Integer> createUserMap(String borrowedUsers)
    {
    	String output = borrowedUsers.replace("|", ":");
    	HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    	String[] parts = output.split(":");
    	for(String part : parts) {
    		String lib[] = part.split(",");
    		int bid = Integer.parseInt(lib[0]);
    		int uid = Integer.parseInt(lib[1].trim());
    		hmap.put(bid, uid);
    	}
        return hmap;
    }

    
    public String getQuery(String booksInLibrary,String borrowedUsers,String query)
    {
    	HashMap<Integer, Library> lib = new HashMap<Integer, Library>();
    	HashMap<Integer, Integer> user = new HashMap<Integer, Integer>();
    	lib = createLibraryMap(booksInLibrary);
    	user = createUserMap(borrowedUsers);
    	String[] mquery = query.split(",");
    	int qtype = Integer.parseInt(mquery[0]);
    	String result = "";
    	if(qtype==1) {
    		int qq = Integer.parseInt(mquery[1].trim());
    		if(user.get(qq)!=null) {
    			result = "No Stock\nIt is owned by " + user.get(qq) + "\n";
    		}else {
    			String auth = lib.get(qq).author;
    			result = "It is available\nAuthor is "+ auth + "\n";
    		}
    	}else if(qtype==2) {
    		int qq = Integer.parseInt(mquery[1].trim());
    		for(Map.Entry<Integer, Integer> entry:user.entrySet()) {
    			if(entry.getValue()==qq) {
    				result = result + entry.getKey() + " " + lib.get(entry.getKey()).bookName + "\n";
    			}
    		}
    	}else if(qtype == 3) {
    		String qq = mquery[1].trim();
    		int ic = 0, oc = 0;
    		for(Map.Entry<Integer, Library> entry:lib.entrySet()) {
    			if(entry.getValue().bookName.equals(qq)) {
    				if(user.get(entry.getKey())!=null)
    					oc++;
    				else ic++;
    			}
    		}
    		result = "" + oc + " out\n" + ic + " in\n"; 
    	}else if(qtype == 4) {
    		String qq = mquery[1].trim();
    		for(Map.Entry<Integer, Library> entry:lib.entrySet()) {
    			if(entry.getValue().author.equals(qq)){
    				if(!result.contains(entry.getValue().bookName)) {
    					result = result + entry.getValue().bookName + "\n";
    				}
    			}
    		}
    	}else if(qtype == 5) {
    		String qq = mquery[1].trim();
    		for(Map.Entry<Integer, Library> entry:lib.entrySet()) {
    			if(entry.getValue().bookName.toLowerCase().contains(qq.toLowerCase())) {
    				result = result + entry.getKey()+ " " + entry.getValue().bookName+"\n";
    			}
    		}
    		
    	}
         
        return result;
    }
    
}

