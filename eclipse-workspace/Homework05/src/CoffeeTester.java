import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Coffee Hour!!!");
		System.out.println("");
		System.out.println("What's the name of the first coffee?");
		String firstName = input.nextLine();
		System.out.println("What is the caffeine content?");
		int firstContent = input.nextInt();
		input.nextLine();
		
		Coffee firstCoffee = new Coffee(firstName, firstContent);
		System.out.print(firstCoffee.toString());
		System.out.println("It would take " + firstCoffee.riskyAmount() + " of " + firstName + " before it's dangerous to drink more.");
		System.out.println("");
		
		System.out.println("What's the name of the second coffee?");
		String secondName = input.nextLine();
		System.out.println("What is the caffeine content?");
		int secondContent = input.nextInt();
		input.nextLine();
		
		Coffee secondCoffee = new Coffee(secondName, secondContent);
		System.out.println(secondCoffee.toString());
		
		
		System.out.println("Are both coffee's the same? " + firstCoffee.equals(secondCoffee));
		
		System.out.println("Do you want to create more coffee objects? \"Yes\" or \"No\"");
		String moreCoffee = input.nextLine();
		
		if (moreCoffee.equalsIgnoreCase("yes"))
		{
			main(args);
		}
		else
		{
			System.out.println("Thank you, Goodbye! Exitting Program.");
		}
	}

}
