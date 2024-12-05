//Christopher Chua

import java.util.Scanner;
public class homework4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//Specify size
		System.out.println("How many circles would you like to input?");
		int arraySize = input.nextInt();
		
		double[] array = new double[arraySize];
		
		for (int i = 0; i < arraySize; i++)
		{
			while (true)
			{
				System.out.println("Enter the radius value of each circle: ");
				array[i] = input.nextDouble();
				
				if (array[i] >= 0)
				{
					
					break;
				}
				else
				{
					System.out.println("Invalid input. Please put in a positive number.");
				}
			}
		
		}
		
		for (int i = 0; i < arraySize; i++)
		{
			System.out.println(array[i]);
			
			//Have user choose an option
			System.out.println("What would you like to do?");
			System.out.println("A) Circles' Data: total # of circles to store in the collection and the radius of each circle in the collection");
			System.out.println("B) Sort and display the circles' areas from smallest to largest");
			System.out.println("C) Sort and display the circle's areas from largest to smallest");
			System.out.println("D) Find and display all unique circles' areas in the collection");
			System.out.println("Q) Quit the program");
			String userChoice = input.nextLine().toLowerCase();
		
			while (userChoice == "a" && userChoice == "b" && userChoice == "c" && userChoice == "d")
			{
				System.out.println("");
			}
		}
		
			
			
		
	}

}
