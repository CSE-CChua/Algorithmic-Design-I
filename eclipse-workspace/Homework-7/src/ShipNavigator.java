import java.util.Scanner;

public class ShipNavigator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean anotherShip = true;
		
		while (anotherShip) { 
			System.out.println("Welcome to the Ship Navigator!!!");
			System.out.println("Enter the name of the ship: ");
			String shipName = input.nextLine();
			System.out.println("Enter the launch dat (mm/dd/yyyy): ");
			String launchDate = input.nextLine();
			System.out.println("Is it a cruise ship or a cargo ship?");
			String cruiseOrCargo = input.nextLine().toLowerCase();
		
			if (cruiseOrCargo.equals("cruise ship")) {
				System.out.println("Enter the ship's passenger capacity: ");
				int passengerCapacity = input.nextInt();
				System.out.println("How many crew members are on this ship?");
				int crewMemNum = input.nextInt();
				input.nextLine();
			
				CruiseShip cruiseShip = new CruiseShip(shipName, launchDate, passengerCapacity, crewMemNum);
				System.out.println("Creating a cruise ship...");
				System.out.println("Printing the ship's details: ");
				System.out.println(cruiseShip.toString());
			}
			else if (cruiseOrCargo.equals("cargo ship")) {
				System.out.println("Enter the ship's tonnage: ");
				double tonnage = input.nextDouble();
				System.out.println("Enter the maximum speed of the ship (in mph): ");
				double maxSpeed = input.nextDouble();
				input.nextLine();
				
				CargoShip cargoShip = new CargoShip(shipName, launchDate, tonnage, maxSpeed);
				System.out.println("Creating a cargo ship...");
				System.out.println("Printing the ship's details.");
				System.out.println(cargoShip.toString());
			}
			else {
				System.out.println("Invalid option.");
				continue;
			}
			
			System.out.println("Do you want to construct another ship object? Enter yes or no.");
			String response = input.nextLine().toLowerCase();
			anotherShip = response.equals("yes");
		}
		System.out.println("Goodbye.");

	}

}
