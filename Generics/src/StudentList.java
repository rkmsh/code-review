import java.util.*;
public class StudentList<T> {
	ArrayList<T> students = new ArrayList<T>();
	public void addElement(T t) {
		students.add(t);
	}
	public void removeElement(T t) {
		students.remove(t);
	}
	
	public void getElement(int i) {
		students.get(i);
	}
	
	public String beginsWith(String query) {
		String res = "";
		for(T student:students) {
			if(student instanceof String) {
				if((student.toString().toLowerCase()).startsWith(query.toLowerCase())) {
					res = res + student.toString() + "\n";
				}
			}
		}
		return res;
	}
	
	public String bloodGroupOf(String blood_data, String query) {
		String res = "";
		String blood_arr[] = blood_data.split(" ");
		for(int i=0;i<blood_arr.length;i++) {
			if(blood_arr[i].equals(query)) {
				res = res.concat(students.get(i).toString()).concat("\n");
			}
		}
		return res;
	}
	
	public String thresholdScore(int marks) {
		int count = 0;
		for(T student:students) {
			if((Integer)student>=marks) {
				count++;
			}
		}
		return ""+count+" students scored "+marks+" above";
	}
}
