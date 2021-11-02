import java.util.*;
public class ScoreList<T> {
	ArrayList<T> scores = new ArrayList<T>();
	
	public void addElement(T t) {
		scores.add(t);
	}
	public void removeElement(T t) {
		scores.remove(t);
	}
	
	public void getElement(int i) {
		scores.get(i);
	}
	
	public String averageValues(int size) {
		double sum = 0.0;
		double avg = 0.0;
		for(T score:scores) {
			sum += (Double)score;
		}
		
		avg = (Double)sum/size;
		return String.format("%.2f", avg);
	}
}
