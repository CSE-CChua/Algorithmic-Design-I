import java.util.Scanner;

public class GreaterThanValue {
	
	public static final int VALUE = 1000;

	public static void main(String[] args) {
		
		//package - a library of classes that have been pre-defined.
		//creating scanner object
		Scanner key = new Scanner(System.in);
		
		//ask user for input value
		System.out.println("Enter an Integer:");
		int number = key.nextInt();
		
		if (number > VALUE)
		{
			//if-block
			System.out.println("The number entered is greate than 1000");
		}
		else
		{
			System.out.println("The number entered is not greater than 1000");
		}

	}

}
