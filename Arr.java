package Tushar.com;

import java.util.ArrayList;

public class Arr {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
        names.add("Tushar");
        names.add("Ajju");
        names.add("Harsh");
        names.add("Saurabh");
        System.out.println(names);
        System.out.println("Element at index 1: " + names.get(1)); // Accessing element at index 1
        System.out.println("Element at index 0: " + names.get(0)); // Accessing element at index 0
names.remove(2);
System.out.println(" after remove"  +names);
names.set(0, "Ram");
System.out.println(names);
names.add(2, "Tushar");
System.out.println(names);
System.out.println(names.isEmpty());
names.clear();
System.out.println(names);
	}

}
