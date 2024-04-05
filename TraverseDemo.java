package Tushar.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseDemo {

	public static void main(String[] args) {
		// 
		ArrayList<String> names = new ArrayList<>();
	     names.add("Tushar");
	     names.add("Ajju");
	     names.add("Harsh");
	     names.add("Saurabh");
	     System.out.println(names);
	     
	     // for - each
	     for(String str : names)
	     {
	    	 System.out.print(str + " \t " +str.length() + " \t ");
	    	 // Reverse
	    	 StringBuffer  br = new StringBuffer(str);
	    	 System.out.println("Reverse " +br.reverse());
	     }
	     
	     System.out.println("...............Itration (Forword Traversing...................");
	     Iterator<String> itr = names.iterator();
	     while(itr.hasNext())
	     {
	    	 String nxt = itr.next();
	    	 System.out.println(nxt);
	     }

	     System.out.println("...............ListIteartor (BackWord Traversing...................");
	     ListIterator<String> litr = names.listIterator(names.size());
	     while(litr.hasPrevious()) {
	         String pr = litr.previous();
	         System.out.println(pr);
	     }

	     
	}

}
