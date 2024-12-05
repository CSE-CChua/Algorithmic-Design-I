import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Apple firstApple = new Apple();
		
		System.out.println("Welcome to the Apple Tester!!!");
		System.out.println("");
		System.out.println("Creating the first Apple!");
		System.out.println("");
		System.out.println("Default values of the first apple object:");
		System.out.println("");
		firstApple.writeOutput();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Enter the type of the second apple object: ");
		String secondType = input.nextLine();
		System.out.println("");
		System.out.println("Enter the weight of the second apple object: ");
		double secondWeight = input.nextDouble();
		System.out.println("");
		System.out.println("Enter the price of the second apple object: ");
		double secondPrice = input.nextDouble();
		System.out.println("");
		
		System.out.println("Creating the second Apple!");
		System.out.println("");
		System.out.println("Values fo the second apple object:");
		System.out.println("");
		Apple secondApple = new Apple(secondType, secondWeight,secondPrice);
		secondApple.writeOutput();

	}

}
