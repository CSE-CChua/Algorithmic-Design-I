//Christopher Chua
import java.util.Scanner;
import java.util.Random;
public class Homework03 {

	public static final int MAX = 3;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Random r = new Random();
		
		Boolean nextGame = true;
		
		while (nextGame == true)
		{
			//Declare variables
			int userWin = 0;
			int computerWin = 0;
			int playerInt = 0;
			
			for (int i = 0; i < 3; i++)
			{
				
				//User input
				System.out.println("Rock, Paper, Scissor, Shoot!!!");
				String userChoice = input.nextLine().toLowerCase();
				
				//validate user input
				while (userChoice.equals("rock") && userChoice.equals("paper") && userChoice.equals("scissor"))
				{
					System.out.println("Invalid input!!!");
					System.exit(i);
				}
			
				int computerChoice = 1+r.nextInt(MAX);
			
				//convert user input to rock, paper, scissor, values
				if (userChoice.equals("rock"))
				{
					playerInt = 1;
				}
				if (userChoice.equals("paper"))
				{
					playerInt = 2;
				}
				if (userChoice.equals("scissor"))
				{
					playerInt = 3;
				}
				
				
				//simulate game
				if (playerInt == computerChoice)
				{
					System.out.println("It's a tie!!!");
				}
				else if (playerInt == 1 && computerChoice == 3 || playerInt == 2 && computerChoice == 1 || playerInt == 3 && computerChoice == 2)
				{
					System.out.println("You Won this round!");
					userWin++;
				}
				else 
				{
					System.out.println("You Lost this round.");
					computerWin++;
				}
			}
			
			System.out.println("You won: " + userWin + " round(s). The computer won: " + computerWin + " round(s).");
			
			if (userWin > computerWin)
			{
				System.out.println("You Win the game!!!");
			}
			else if (userWin < computerWin)
			{
				System.out.println("Unfortunately, you have lost the game.");
			}
			else 
			{
				System.out.println("You tied with the Computer.");
			}
			
			
			System.out.println("Would you like to play again? (Yes/No)");
			String playAgain = input.nextLine().toLowerCase();
			
			if (playAgain == "no")
			{
				nextGame = false;
			}
		}

	}

}
