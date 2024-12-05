//Christopher Chua

import java.util.Scanner;

public class Lab05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Ask for user input
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
		int dollars = input.nextInt();
		
		
		//Declare variables
		int chocolateBars = dollars;
		int coupons = chocolateBars;
		
		//validate user input
		if (dollars < 1)
		{
			//invalid input message
			System.out.println("Invalid value for amount. Exiting the program.");
			System.exit(dollars);
		}
		else
		{
			//calculate chocolate and coupons
			while(coupons >= 6)
			{
				chocolateBars++;
				coupons -= 5;
			}
		}
		System.out.println("You can buy " + chocolateBars + " and will have " + coupons + " coupons left!");

	}

}
