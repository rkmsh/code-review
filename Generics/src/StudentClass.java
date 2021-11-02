import java.util.*;
public class StudentClass {
	public String getQuery(String studentData, String query) {
		int type;
		String res="";
		type = Integer.parseInt(query.split(",")[0]);
		String a[] = studentData.split(" ");
		if(type==1) {
			StudentList<String> list = new StudentList<String>();
			for(int i=0;i<a.length;i++) {
				list.addElement(a[i]);
			}
			
			String query_data = query.split(",")[1];
			res = list.beginsWith(query_data);
		}else if(type==2) {
			StudentList<String> list = new StudentList<String>();
			for(int i=0;i<a.length;i++) {
				list.addElement(a[i]);
			}
			String query_data = query.split(",")[2];
			String blood_data = query.split(",")[1];
			res = list.bloodGroupOf(blood_data, query_data);
		}else if(type==3) {
			StudentList<Integer> list = new StudentList<Integer>();
			for(int i=0;i<a.length;i++) {
				list.addElement(Integer.parseInt(a[i]));
			}
			int query_data = Integer.parseInt(query.split(",")[1]);
			res = list.thresholdScore(query_data);
		}else if(query.equals("4")) {
			ScoreList<Double> list = new ScoreList<Double>();
			for(int i=0;i<a.length;i++) {
				list.addElement(Double.parseDouble(a[i]));
			}
			
			res = list.averageValues(a.length);
			
		}else if(query.equals("5")) {
			ScoreList<Double> list = new ScoreList<Double>();
			for(int i=0;i<a.length;i++) {
				list.addElement(Double.parseDouble(a[i]));
			}
			res = list.averageValues(a.length);
		}
		return res;
	}
}
