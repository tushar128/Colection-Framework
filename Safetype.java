package Tushar.com;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class Safetype {

	public static void main(String[] args) {
		/* Creating Collections:
        1) Type-safe
        2) Untyped */

     // Type-Safe Collection
     ArrayList<String> names = new ArrayList<>();
     names.add("Tushar");
     names.add("Ajju");
     names.add("Harsh");
     names.add("Saurabh");
     System.out.println(names);
     System.out.println("Element at index 1: " + names.get(1)); // Accessing element at index 1
     System.out.println("Element at index 0: " + names.get(0)); // Accessing element at index 0

     // Untyped Collection (Note: Using raw types like this is discouraged)
    /* LinkedList<Object> list = new LinkedHashSet<>();
     list.add("Tushar");
     list.add(102); // Adding an integer */
	}

}
