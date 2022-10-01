import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
				/* ArrayList String */
		ArrayList<String> alString = new ArrayList<>();
		alString.add("Tejas");
		alString.add("Sanjay");
		alString.add("Kute");
		
		System.out.println("Array: "+alString);
		
		System.out.print("Full Name: ");
		//Iterate Array Elements by Using forEach
		for (String str : alString) {
			System.out.print(str + " ");
		}
	}
}