
public class CargoShip extends Ship{

	private double tonnage;
	private double maxSpeed;

	
	public CargoShip (String shipName, String launchDate, double tonnage, double maxSpeed) {
		super(shipName, launchDate);
		this.tonnage = tonnage;
		this.maxSpeed = maxSpeed;
	}
	
	public double getTonnage () {
		return tonnage;
	}
	
	public double getMaxSpeed () {
		return maxSpeed;
	}
	
	public void setTonnage(double tonnage) {
		this.tonnage = tonnage;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public String toString() {
		return "Ship Name: "+ getShipName() + "\n\nTonnage: " + tonnage + "DWT" + "\n\nMaximum Speed: " + maxSpeed + "mph";
	}
}
