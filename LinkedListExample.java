import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
				/* LinkedList String */
		LinkedList<String> llString = new LinkedList<>();
		llString.add("Tejas");
		llString.add("Sanjay");
		llString.add("Kute");
		
		System.out.println("Array: "+llString);
		
		System.out.print("Full Name: ");
		//Iterate Array Elements by Using forEach
		for (String str : llString) {
			System.out.print(str + " ");
		}
	}
}