
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lb = new Library();
		/*
		 * String actual=lb.
		 * getQuery("125,C programming,Brian W. Kernighan|564,C++ programming,Bjarne Stroustrup|546,Java programming,James Gosling|897,Data Structure,Adam Drozdek|785,System Programming,Johnson M|265,Data Structure,Adam Drozdek|469,Data Structure,Adam Drozdek|968,Advanced Java,James Gosling"
		 * ,"125,101|564,102|546,103|897,104|785,101","1,546"); String
		 * exp="No Stock\nIt is owned by 103\n"; System.out.println(exp);
		 * System.out.println(actual);
		 */
        
        //String actual=lb.getQuery("1001,Adventures of Sherlock Holmes,Sir Arthur Conan Doyle|1002,Adventures of Tom Sawyer,The Mark Twain|1003,Alice in the Wonderland,Lewis Carroll|1004,All’s Well that Ends well,William Shakespeare|1005,As you like it,William Shakespeare|1006,Anand Math,Bankim Chandra Chatterjee","1006,101|1003,102|1001,101","2,101");
        //String exp="1001 Adventures of Sherlock Holmes\n1006 Anand Math\n";
        //String actual=lb.getQuery("125,C programming,Brian W. Kernighan|564,C++ programming,Bjarne Stroustrup|546,Java programming,James Gosling|897,Data Structure,Adam Drozdek|785,System Programming,Johnson M|265,Data Structure,Adam Drozdek|469,Data Structure,Adam Drozdek|968,Advanced Java,James Gosling","125,101|564,102|546,103|897,104|785,101","3,Data Structure");
        //String exp="1 out\n2 in\n";
        //String actual=lb.getQuery("1001,Adventures of Sherlock Holmes,Sir Arthur Conan Doyle|1002,Adventures of Tom Sawyer,The Mark Twain|1003,Alice in the Wonderland,Lewis Carroll|1004,All’s Well that Ends well,William Shakespeare|1005,As you like it,William Shakespeare|1006,Anand Math,Bankim Chandra Chatterjee","1006,101|1003,102|1001,101","4,William Shakespeare");
        //String exp="All’s Well that Ends well\nAs you like it\n";
		String actual=lb.getQuery("1001,Python Tricks,Dan Bader|1002,The Complete Software Developer's Career Guide,John Sonmez|1003,Mastering Deep Learning Fundamentals with Python,Richard Wilson|1004,Cracking the Coding Interview,Gayle Laakmann McDowell|1005,Python Programming,Joseph Mining|1006,Effective Java,Joshua Bloch|1007,Java,Nathan Clark|1008,JavaScript Programming,Brian Jenkins|1009,Functional-Light JavaScript,Kyle Simpson","1006,101|1009,102|1003,101","5,java");
        String exp="1008 JavaScript Programming\n1009 Functional-Light JavaScript\n1006 Effective Java\n1007 Java\n";
		System.out.println(exp);
		System.out.println(actual);


	}

}
