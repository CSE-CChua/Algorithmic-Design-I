
public class CruiseShip extends Ship {
	
	private int passengerCapacity;
	private int crewMemNum;
	
	public CruiseShip (String shipName, String launchDate, int passengerCapacity, int crewMemNum) {
		super(shipName, launchDate);
		this.passengerCapacity = passengerCapacity;
		this.crewMemNum = crewMemNum;
	}
	
	//Accessor
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	
	public int getCrewMemNum() {
		return crewMemNum;
	}
	
	//mutators
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	public void setCrewMemNum(int crewMemNum) {
		this.crewMemNum = crewMemNum;
	}
	
	public String toString() {
		return "Ship Name: "+ getShipName() + "\n\nNumber of Crew Members: " + crewMemNum + "\n\nPassenger Capacity: " + passengerCapacity;
	}
}
