//Christopher Chua
public class Coffee {
	
	private String coffeeName;
	private int caffeineContent;
	
	//default constructor
	public Coffee() 
	{
		this.coffeeName = "none";
		this.caffeineContent = 50;
	}
	
	public Coffee(String xCoffeeName, int xCaffeineContent)
	{
		setCoffeeName(xCoffeeName);
		setCaffeineContent(xCaffeineContent);
	}
	
	//Accessor
	public String getCoffeeName()
	{
		return coffeeName;
	}
	
	public int getCaffeine()
	{
		return caffeineContent;
	}
	
	
	//Mutator
	public void setCoffeeName(String xCoffeeName)
	{
		if (xCoffeeName != null)
		{
			coffeeName = xCoffeeName;
		}
		else
		{
			System.out.println("Invalid input for coffee name!");
		}
	}
	
	
	public void setCaffeineContent(int xCaffeineContent)
	{
		if (xCaffeineContent >= 50 && xCaffeineContent <=300)
		{
			caffeineContent = xCaffeineContent;
		}
		else
		{
			System.out.println("Invalid input for caffeine content!");
		}
	}
	
	
	public double riskyAmount()
	{
		double cupsAmount = 180.0 / ((caffeineContent / 100.0) * 6.0);
		return cupsAmount;
	}
	
	public boolean equals(Coffee other)
	{
		if (other == this)
		{
			return true;
		}
		
		if (!(other instanceof Coffee))
		{
			return false;
		}
		return coffeeName.equals(other.coffeeName) && caffeineContent == other.caffeineContent;
	}
	
	public String toString()
	{
		return "Name: " + coffeeName + "\n\nCaffeine Amount: " + caffeineContent + "\n";
	}
	
}
