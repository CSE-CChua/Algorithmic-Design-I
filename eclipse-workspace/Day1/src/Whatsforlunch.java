import java.util.Scanner;

public class Whatsforlunch {

	public static void main(String[] args) {
		
		//print a message on the console
		//single-line comment
		/*
		 multi-line comment
		 */

		System.out.println("Welcome to my first Java program!!!");
		
		/*
		 * \n - new line
		 * println 
		 */
		System.out.print("\"JAVA\" is fun\n");
		
		//creates a scanner object
		Scanner key = new Scanner(System.in);
		System.out.println("What\'s for lunch today? Enter Entree:");
		
		String entree; //declare a  variable
		entree = key.nextLine();
		
		System.out.println("Entreee: " + entree);
		
		// + concatenation(join) operator
		// = assignment operator
	}

}
