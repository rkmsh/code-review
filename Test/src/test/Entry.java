package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Entry {

	public static void main(String[] args) {
		//System.out.println("This is the entry point");
		
		ArrayList<HashSet<String>> h1 = new ArrayList<>();
		//System.out.println(h1.size());
		String st = "Ronaldo Eder Andre Bruma Goncalo Jota Daniel Patrício Ricardo Domingos Semedo Bernardo Pereira Bruno Pizzi Paciencia Jota Daniel Patrício Eder Andre Bruma Goncalo Jota Daniel Patrício Ricardo Domingos Semedo Bernardo Pereira Bruno#Ronaldo Eder Andre Bruma Goncalo Joao Dyego Jose Nelson Pepe Mario Pereira Rafa Renato Ferro Bruma Goncalo Joao Dyego Pereira Rafa Renato Ferro Bruma Goncalo Joao Dyego#Ronaldo Eder Andre Bruma Goncalo Jota Daniel Patrício Nelson Pepe Mario Pereira Rafa Renato Ferro Daniel Patrício Daniel Patrício Nelson Pepe Mario Pereira Nelson Pepe Mario Pereira Rafa Renato Ferro Daniel Patrício#Ronaldo Eder Andre Bruma Goncalo Joao Dyego Jose Ricardo Domingos Semedo Bernardo Pereira Bruno Pizzi Andre Bruma Goncalo Joao Dyego Jose Ricardo Domingos Semedo Bernardo";
		ArrayList<String> as = new ArrayList<String>(Arrays.asList(st.split("#")));
		HashSet<String> un = new HashSet<String>();
		for(int i=0;i<as.size();i++) {
			h1.add(new HashSet<String>(Arrays.asList(as.get(i).split(" "))));
			if(i>0) {
				un.retainAll(h1.get(i));
			}
			else {
				un.addAll(Arrays.asList(as.get(i).split(" ")));
			}
		}
		h1.get(3).removeAll(h1.get(1));
		//for(HashSet<String> h: h1) {
		//	System.out.println(h);
		//}
		String st1 = String.join(" ", un);
		String st2 = String.join(" ", h1.get(3));
		System.out.println(st1 + ", " + st2);
	}

}
