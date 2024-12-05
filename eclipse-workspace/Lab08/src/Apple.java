//Christopher Chua
public class Apple {
	
	private String type;
	private double weight;
	private double price;


//Default Constructor
public Apple() {
	
	this.type = "Gala";
	this.weight = 0.5;
	this.price = 0.88;
}

//Parameterized Constructor
public Apple(String xType, double xWeight, double xPrice) {
	setType(xType);
	setWeight(xWeight);
	setPrice(xPrice);
}

//Accessor
public String getType () {
	return type;
}

public double getWeight () {
	return weight;
}

public double getPrice () {
	return price;
}

public void setType(String xType) {
	if (xType.equals("Red Delicious") || xType.equals("Golden Delicious") || xType.equals("Gala") || xType.equals("Granny Smith"))
	{
		type = xType;
	}
	else 
	{
		System.out.println("Invalid value to type!");
	}
}

public void setWeight(double xWeight) {
	if (xWeight >= 0 && xWeight < 2)
	{
		weight = xWeight;
	}
	System.out.println("Invalid value for Weight!");
}

public void setPrice(double xPrice) {
	if (xPrice > 0)
	{
		price = xPrice;
	}
	System.out.println("Invalid value for Price!");
}

//writeOutput method
public void writeOutput() {
	System.out.println("Type: " + type);
	System.out.println("");
	System.out.println("Weight: " + weight + " kg");
	System.out.println("");
	System.out.println("Price: $" + price);
	System.out.println("");
}

}
