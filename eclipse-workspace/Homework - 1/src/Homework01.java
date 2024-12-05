//Christoher Chua
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//get user input
		System.out.println("Enter your first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Enter your last name: ");
		String lastName = input.nextLine();
		
		System.out.println("Enter your age (in years): ");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter your phone number (without and dashes/parenthesis): ");
		String phoneNumber = input.nextLine();
		
		System.out.println("Enter your major: ");
		String major = input.nextLine();
		
		System.out.println("What year in school are you in? ");
		String schoolYear = input.nextLine();
		
		System.out.println("What is today's date (using the format mm/dd/yyyy)? ");
		String todaysDate = input.nextLine();
		int dateYear = 2024;
		
		System.out.println("What is a location you wish to visit?");
		String locationVisit = input.nextLine();
		
		System.out.println("What is your favorite song right now? (Don't include artist)");
		String favSong = input.nextLine();
		
		System.out.println("Who is that song by?");
		String songArtist = input.nextLine();
		
		System.out.println("What is your favorite drink?");
		String favDrink = input.nextLine();
		
		//Calculate birth year of user
		int birthYear = dateYear - age;
		
		//Convert date to Eu format
		String dateMonth = todaysDate.substring(0,2);
		String dateDay = todaysDate.substring(3,5);
		String euDate = dateDay + (".") + dateMonth + (".") + dateYear;
		
		//Convert phone number format
		String areaCode = phoneNumber.substring(0,3);
		String firstThreePN = phoneNumber.substring(3,6);
		String lastFourPN = phoneNumber.substring(6,10);
		String newPhoneFormat = (("(") + areaCode +(")") + firstThreePN + ("-") +lastFourPN); 
		
		//Print out intro
		System.out.println("Hello! " + firstName + " " + lastName +":");
		System.out.println("");
		System.out.println("You were born in the year " + birthYear +". A place you wish to visit is "+ locationVisit + " interesting point of "
				+ "interest! Your current favorite song is "+ favSong + " by " + songArtist + ". Wonderful music taste! You enjoy drinking " + 
				favDrink + ", I love drinking " + favDrink + " as well! You are currently a " + schoolYear + " at the University of South Carolina,"
				+ " majoring in " + major + ". You can be reached through your phone by dialing " + newPhoneFormat + ". Welcome to USC!!!.");
		System.out.println("");
		System.out.println("Last Updated: " + euDate);
		
		//close scanner
		input.close();
	}

}
