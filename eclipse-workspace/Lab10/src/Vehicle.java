
public class Vehicle {

	private String manuName;
	private int cylinders;
	private String ownersName;
	
	//default
	public Vehicle() {
		this.manuName = "Unknown";
		this.cylinders = 4;
		this.ownersName = "Unknown";
	}
	
	public Vehicle (String manuName, int cylinders, String ownersName) {
		this.manuName = manuName;
		this.cylinders = cylinders;
		this.ownersName = ownersName;
	}
	
	//Accessors
	public String getManuName () {
		return manuName;
	}
	
	public int getCylinders () {
		return cylinders;
	}
	
	public String getOwnersName () {
		return ownersName;
	}
	
	//mutators
	public void setManuName(String manuName) {
		if (manuName != null && !manuName.isEmpty())
		{
			this.manuName = manuName;
		}
		else
		{
			System.out.println("Invalid manufacturer's name.");
		}
		
	}
	
	public void setCapacity(int cylinders) {
		if (cylinders > 0)
		{
			this.cylinders = cylinders;
		}
		else
		{
			 System.out.println("Invalid amount of cylinders");
		}
	}
	
	public void setOwnersName(String ownersName) {
		if (ownersName != null && !ownersName.isEmpty())
		{
			this.ownersName = ownersName;
		}
		else
		{
			System.out.println("Invalid owner's name.");
		}
	}
	
	public boolean equals(Vehicle other) {
		if (this == other) 
		{
			return true;
		}
		
		if (other == null)
		{
			return false;
		}
		
		if (this.getClass() != other.getClass())
		{
			return false;
		}
		
		return this.manuName.equals(other.manuName) && this.cylinders == other.cylinders && this.ownersName.equals(other.ownersName);
	}
	
	public String toString() {
		return "Manufacturer's Name: " + manuName + "\n\nNumber of Cylinders: " + cylinders + "\n\nOwner's Name: " + ownersName;
	}
}
