
public class Ship {

	private String shipName;
	private String launchDate;
		
	//Constructor
	public Ship(String shipName, String launchDate) {
		this.shipName = shipName;
		this.launchDate = launchDate;
	}
	
	//Accessors
	public String getShipName() {
		return shipName;
	}
	
	public String getLaunchDate() {
		return launchDate;
	}
	
	//Mutators
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	public void setLaunchDate(String launchDate) {
		String[] parts = launchDate.split("/");
		int year = Integer.parseInt(parts[2]);
		if (year >= 1990 && year <= 2019)
		{
			this.launchDate = launchDate;
		}
		else
		{
			System.out.println("Invalid launch date, launch date must be between 1990 and 2019.");
		}
	}
	
	public String toString() {
		return "Ship Name: " + shipName + "\n\nLaunch Date: " + launchDate;
	}
}
