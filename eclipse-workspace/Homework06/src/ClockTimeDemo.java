import java.util.Scanner;
public class ClockTimeDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean repeat = true;
		while (repeat)
		{
		
		
			System.out.println("Enter the hours on the military clock: ");
			int hours = input.nextInt();
			
			System.out.println("Enter the minuted on the military clock: ");
			int minutes = input.nextInt();
			
			System.out.println("Enter the seconds on the military clock: ");
			int seconds = input.nextInt();
			
			try
			{
				TimeConverter firstTimeConversion = new TimeConverter();
				firstTimeConversion.updateTime(hours, minutes, seconds);
				System.out.print("12-hour clock time: ");
				firstTimeConversion.displayTime();
			}
		catch (TimeException e)
		{
			System.out.println("Invalid values for 12-hour clock.");
		}
		
			System.out.println("Enter 24 hour clock time in the format \"hours:minutes:seconds\"");
			input.nextLine();
			String timeTwo = input.nextLine();
			
			
			try {
				TimeConverter secondTimeConversion = new TimeConverter();
				secondTimeConversion.updateTime(timeTwo);
				System.out.print("12-hour clock time: ");
				secondTimeConversion.displayTime();
			}
			catch (TimeException e){
				System.out.println("Invalid values!");
			}
			
			System.out.println("Would you like to do this again? Enter \"Yes\" or \" No\"");
			String repeatConversion = input.next().toLowerCase();
			
			if (repeatConversion.equals("yes"))
			{
				repeat =true;
			}
			else
			{
				repeat = false;
				System.out.println("Exitting program.");
			}
		}
	}

}
