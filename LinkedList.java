package Tushar.com;
import java.util.LinkedList;
public class LinkedList {

	public static void main(String[] args) {
		// 2) Untyped
        // Untyped Collection (Note: Using raw types like this is discouraged)
        LinkedList<Object> list = new LinkedList<>();
        list.add("Tushar");
        list.add(102); // Adding an integer
        System.out.println(list);
	}

}
