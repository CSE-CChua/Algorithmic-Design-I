//Christpher Chua
import java.util.Scanner;
public class lab3 {

	//Initialize constatnt variables
	public static final double DISCOUNTTWENTY = .20;
	public static final double DISCOUNTTHIRTY = .30;
	public static final double DISCOUNTFORTY = .40;
	public static final double DISCOUNTFIFTY = .50;
	public static final double PRICE = 99.00;
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		//Prompt the user for total number of packages ordered
		System.out.println("Please enter the total number of software packages ordered: ");
		double totalPackages = key.nextInt();
		double discount = 0;
		
		//Test for discount
		if (totalPackages > 0 && totalPackages <=9)
		{
			discount = 0;
		}
		else if (totalPackages > 9 && totalPackages < 20)
		{
			discount = DISCOUNTTWENTY;	
		}
		else if (totalPackages >=20 && totalPackages <50)
		{
			discount = DISCOUNTTHIRTY;
		}
		else if (totalPackages >=50 && totalPackages <100)
		{
			discount = DISCOUNTFORTY;
		}
		else if (totalPackages >= 100)
		{
			discount = DISCOUNTFIFTY;
		}
		else
		{
			System.out.println("Invalid value for package count! Exiting the program!");
			System.exit(0);
		}
		
		//Calculate prices
		double totalNoDisc = totalPackages * PRICE;
		double totalDiscount = totalNoDisc * discount;
		double totalBill = totalNoDisc - totalDiscount;
		
		
		//Print results
		System.out.println("Total Bill Amount (before discount) = $" + totalNoDisc);
		System.out.println("Amount of discount = $" + totalDiscount);
		System.out.println("Total Bill Amount (after discount) = $" + totalBill);
	}

}
