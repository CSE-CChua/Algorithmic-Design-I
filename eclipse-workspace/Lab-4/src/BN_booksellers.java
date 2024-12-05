//Christopher Chua
import java.util.Scanner;
public class BN_booksellers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt the user for the number of books purchased during the current month
		System.out.println("How many books did you purxhase at BN booksellers this month?");
		int booksPurchased = input.nextInt();
		
		int pointsEarned = 0;
		
		//if statement to check for valid inputs
		if (booksPurchased < 0)
		{
			System.out.println("Error!!! Invalid number.");
			System.exit(booksPurchased);
		}
		else
		{
			//switch statement for number of books and points earned
			switch (booksPurchased)
			{
			case 0:
				pointsEarned = 0;
				break;
			case 1:
				pointsEarned = 5;
				break;
			case 2:
				pointsEarned = 15;
				break;
			case 3:
				pointsEarned = 30;
				break;
			default:
				pointsEarned = 60;
				break;
			}
		}
		
		//Print out results
		if (pointsEarned == 0)
		{
			System.out.println("You have not earned any points yet. Make a book purchase to start earning points!");
		}
		else
		{
			System.out.println("Congratulations!!! You have earned " + pointsEarned + " points!");
			System.out.println("You may redeem these points on your next book purchase!");
		}
	}

}
