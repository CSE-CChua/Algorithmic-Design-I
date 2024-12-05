
public class Truck extends Vehicle{

	private double loadCapacity;
	private double towingCapacity;
	
	//default
	public Truck () {
		super();
		this.loadCapacity = 0.0;
		this.towingCapacity = 0.0;
	}
	
	public Truck (String manuName, int cylinders, String ownersName, double loadCapacity, double towingCapacity) {
		super(manuName, cylinders, ownersName);
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}
	
	//accessor
	public double getLoadCapacity() {
		return loadCapacity;
	}
	
	public double getTowingCapacity() {
		return towingCapacity;
	}
	
	//mutator
	public void setLoadCapacity (double loadCapacity) {
		if (loadCapacity >= 0.0)
		{
			this.loadCapacity = loadCapacity;
		}
		else
		{
			System.out.println("Invalid load capacity.");
		}
	}
	
	public void setTowingCapacity (double towingCapacity) {
		if (towingCapacity >= 0.0)
		{
			this.towingCapacity = towingCapacity;
		}
		else
		{
			System.out.println("Invalid towing capacity.");
		}
	}
	
	public boolean equals(Truck otherTruck) {
		if (this == otherTruck) 
		{
			return true;
		}
		
		if (otherTruck == null)
		{
			return false;
		}
		
		if (this.getClass() != otherTruck.getClass())
		{
			return false;
		}
		
		return super.equals(otherTruck) && loadCapacity == otherTruck.loadCapacity && towingCapacity == otherTruck.towingCapacity;
	}
	
	public String toString() {
		return super.toString() + "\n\nLoading Capacity: " + loadCapacity + "\n\ntowingCapacity: " + towingCapacity;
	}
}
