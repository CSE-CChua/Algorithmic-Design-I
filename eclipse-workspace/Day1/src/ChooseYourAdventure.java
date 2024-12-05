//Christopher Chua
import java.util.Scanner;
public class ChooseYourAdventure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		String tavernDecision = "";
		String bearDecision = "";
		char pathDecision = ' ';
		
		
		//Game start
		System.out.println("Welcome to the Elder Scrolls Adventure!!!");
		System.out.println("You have just completed your quest of retrieving the golden claw from Mount ThRandir and must return it to Merlin to assist him in his research");
		System.out.println("");
		System.out.println("");
		System.out.println("After an afternoon of traveling you decided it is time to rest. You spot the nearby town of Riverrun, do you enter? (Y/N)");
		char enterTown = input.next().toUpperCase().charAt(0);
		System.out.println("");
		
		
		//Enter town Decision
		if (enterTown == 'Y')
		{
			System.out.println("You enter town and head to the local Inn.");
			System.out.println("Inn keeper: Greetings traveler, how can I help you?");
			System.out.println("");
			System.out.println("1) I'd like to rent a room for the night.");
			System.out.println("2) I'd like to have a warm meal, a drink, and a room please.");
			System.out.println("3) I'd like a few drinks.");
			tavernDecision = input.next();
			//convert string into int
			int tavernDecisionInt = Integer.parseInt(tavernDecision);
			System.out.println("");
			
			//Validate tavernDecision
			if (tavernDecisionInt < 1 || tavernDecisionInt > 3)
			{
				System.out.println("Inn Keeper: That isn't an option. Don't waste my time!");
				System.exit(tavernDecisionInt);
			}
			else if (tavernDecisionInt == 1)
			{
				System.out.println("Traveler: I'd like to rent a room for the night.");
				System.out.println("Inn Keeper: I've got a room upstairs ready for you. Here's your key.");
				System.out.println("You make your way to your room and get some rest.");
			} else if (tavernDecisionInt == 2)
			{
				System.out.println("Traveler: I'd like to have a warm meal, a drink, and a room please.");
				System.out.println("Inn Keeper: Alright here is some beef stew with a cup of mead. Your room is upstairs, here is your key.");
				System.out.println("You take your stew and mead to a table and enjoy your food.");
				System.out.println("After you finish your meal you head upstairs to your room and get some rest.");
			}
			else
			{
				System.out.println("Traveler: I'd like a few drinks");
				System.out.println("You got so drunk you stumbled out the bar and was arrested for trying to fight a guard.");
				System.exit(enterTown);
			}
			System.out.println("");
			System.out.println("");
			System.out.println("You wake up well rested and head out of town.");
			System.out.println("You reach a crossroad with a guard waiting at the split. He stops you.");
			System.out.println("Guard: To take the path to the Golden City you must pay 200 Gold.");
			System.out.println("Guard: Unless you would rather take the Forest of Wild Dreams path to the city. Fair warning there have been reports bandit activity within the forest.");
			System.out.println("");
			System.out.println("");
			System.out.println("What do you do?");
			System.out.println("a) Pay 200 gold coins and take the path to the Golden City.");
			System.out.println("b) Refuse to pay and take the path through the Forest of Wild Dreams.");
			System.out.println("c) Scream \"A dragon just emerged from the skies!!!\" and make a run through the path to the Golden City.");
			pathDecision = input.next().toUpperCase().charAt(0);
;			
			//switch case for decision
			switch (pathDecision)
			{
			case 'A':
				System.out.println("Traveler: Here is the 200 gold now please let me through.");
				System.out.println("The guard accepts your payment and lets you pass.");
				System.out.println("You make your way through the path and are ambushed by a group of bandits. It turns out the guard was a a bandit all along.");
				System.out.println("They attack you and steal all your belongings, including the golden claw.");
				System.out.println("Quest Failed!");
				break;
			case 'B':
				System.out.println("Traveler: I refuse. I'll take my chances with the Forest of Wild Dreams.");
				System.out.println("You make your way through the Forest of Wild Dreams and run into no issues.");
				System.out.println("You make it to the Golden City and deliver the golden claw to Merlin.");
				System.out.println("Congratulations!!! You completed your quest!!!");
				break;
			case 'C':
				System.out.println("Traveler: A DRAGON!!!! IN THE SKY!!!");
				System.out.println("As the guard turns around in fear, you make a run for the path to the Golden City.");
				System.out.println("You outrun the guard and make it through the path.");
				System.out.println("You reach the Golden City and give Merlin the golden claw.");
				System.out.println("Congratulations!!! You completed your quest!!!");
				break;
			default:
				System.out.println("Guard: Are you gonna do something or what!?");
				break;
			}
			
		}
		else if(enterTown == 'N')
		{
			System.out.println("You skip the town and set up camp in the woods.");
			System.out.println("You make a campfire and roast a fish you caught in the nearby river.");
			System.out.println("After the meal you lay near the fire and get some rest.");
			
			System.out.println("");
			System.out.println("");
			System.out.println("You wake up to a bear rummaging through your sack");
			System.out.println("Do (1) you jump up make a lot of noise and try to look big to scare the bear or (2) you lay still till the bear moves away.");
			bearDecision = input.next();
			int bearDecisionInt = Integer.parseInt(bearDecision);
			
			//validate bearDecision
			if (bearDecisionInt < 1 || bearDecisionInt > 2)
			{
				System.out.println("A dragon emerges from the sky and grabs the bear with your sack. You lost the golden claw, you failed your quest.");
			}
			else if (bearDecisionInt == 1)
			{
				System.out.println("You jump up and scream and try to scare the bear away, but it was a grizzly bear and it attacked you.");
			}
			else
			{
				System.out.println("The bear eats your left over roasted fish and continues on its day, you survive the encounter.");
				System.out.println("Once the bear leaves, you gather whats left of your things and head to the Golden City.");
				System.out.println("Fortunately the bear was uninterested in the golden claw. You arrive to the Golden City with the golden claw and give it to Merlin");
				System.out.println("Congratulations!!! You completed your quest!!!");
			}
		}
		else
		{
			System.out.println("A dragon comes out from a cloud and eats you. (Invalid option)");
			System.exit(enterTown);
		}
	}
}
