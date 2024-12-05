
public class Car extends Vehicle{

	private double gasMileage;
	private int numOfPassengers;
	
	public Car () {
		super();
		this.gasMileage = 0.0;
		this.numOfPassengers = 0;
	}
	
	public Car (String manuName, int cylinders, String ownersName, double gasMileage, int numOfPassengers) {
		super(manuName, cylinders, ownersName);
		this.gasMileage = gasMileage;
		this.numOfPassengers = numOfPassengers;
	}
	
	public double getGasMileage () {
		return gasMileage;
	}
	
	public int getNumOfPassengers () {
		return numOfPassengers;
	}
	
	public void setGasMileage (double gasMileage) {
		if (gasMileage >=0.0)
		{
			this.gasMileage = gasMileage;
		}
		else
		{
			System.out.println("Invalid amound of gas mileage");
		}
	}
	
	public void setNumOfPassengers (int numOfPassengers) {
		if (numOfPassengers >=0)
		{
			this.numOfPassengers = numOfPassengers;
		}
		else
		{
			System.out.println("Invalid number of passengers");
		}
	}
	
	public boolean equals(Car otherCar) {
		if (this == otherCar) 
		{
			return true;
		}
		
		if (otherCar == null)
		{
			return false;
		}
		
		if (this.getClass() != otherCar.getClass())
		{
			return false;
		}
		
		return super.equals(otherCar) && gasMileage == otherCar.gasMileage && numOfPassengers == otherCar.numOfPassengers;
	}
	
	public String toString() {
		return super.toString() + "\n\nGas Mileage: " + gasMileage + "gallons." + "\n\nNumber of Passengers: " + numOfPassengers;
	}
}
