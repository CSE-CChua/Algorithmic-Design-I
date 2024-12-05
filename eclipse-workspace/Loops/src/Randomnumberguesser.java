import java.util.Scanner;
import java.util.Random;
public class Randomnumberguesser {
	
	public static final int MAX = 100;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Random r = new Random();
		
		int secretNumber = r.nextInt(MAX); //generate value between 0 and 99
		
		System.out.println("I will pick a random number between 0 and 99. Can you guess it?");
		
		boolean correctGuess = false;
		
		while (correctGuess == false)
		{
			System.out.println("Enter your gueess: ");
			int guess = input.nextInt();
			
			if (guess > 99 || guess < 0)
			{
				System.out.println("Invalid value entered!");
				System.exit(0);
			}
			
			if (guess < secretNumber)
			{
				System.out.println("Your guess is too low! Pick a larger value!");
			}
			else if (guess > secretNumber)
			{
				System.out.println("Your guess is too high! Pick a smaller value!");
			}
			else if (guess == secretNumber)
			{
				System.out.println("Your guess is correct!!!");
				correctGuess = true;
			}
			else
			{
				System.out.println("Invalid value entered!");
			}
		}
			

	}

}
