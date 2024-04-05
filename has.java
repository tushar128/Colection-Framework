package Tushar.com;

import java.util.HashSet;
import java.util.TreeSet;

public class has {

	public static void main(String[] args) {
		//  hash set
		HashSet<Double> h = new  HashSet<>();
		h.add(23.45);
		h.add(8.8);
		h.add(8.8);
		System.out.println(h);
		// tree set   // sort the  elements
		TreeSet<Double> t = new  TreeSet<>();
		
t.addAll(h);
System.out.println(t);
	}

}
