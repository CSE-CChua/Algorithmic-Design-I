
public class Concert {
	
	private String bandName;
	private int capacity;
	private int ticketsByPhone;
	private int ticketsAtVenue;
	private double priceByPhone;
	private double priceAtVenue;
	
	//default constructor
	public Concert () {
		this.bandName = "no name yet";
		this.capacity = 0;
		this.ticketsByPhone = 0;
		this.ticketsAtVenue = 0;
		this.priceByPhone = 0.0;
		this.priceAtVenue = 0.0;
	}
		
	public Concert (String bandName, int capacity, double priceByPhone, double priceAtVenue) {
		this.bandName = bandName;
		this.capacity = capacity;
		this.priceByPhone = priceByPhone;
		this.priceAtVenue= priceAtVenue;
	}
	
	public Concert (String bandName, int capacity, int ticketsByPhone, int ticketsAtVenue, double priceByPhone, double priceAtVenue) {
		this.bandName = bandName;
		this.capacity = capacity;
		this.ticketsByPhone = ticketsByPhone;
		this.ticketsAtVenue = ticketsAtVenue;
		this.priceByPhone = priceByPhone;
		this.priceAtVenue = priceAtVenue;
	}
	
	//Accessors
	public String getBandName() {
		return bandName;
	}
	public int getCapacity() {
		return capacity;
	}
	public int getNumTicketsSoldByPhone() {
		return ticketsByPhone;
	}
	public int getNumTicketsSoldAtVenue() {
		return ticketsAtVenue;
	}
	public double getPriceByPhone() {
		return priceByPhone;
	}
	public double getPriceAtVenue() {
		return priceAtVenue;
	}
	
	//mutators
	public void setBandName(String bandName) {
		this.bandName = bandName;
	}
	
	public  void setCapacity(int capacity) {
		if (capacity > 0) 
		{
			this.capacity = capacity;
		}
		else
		{
			System.out.println("Invalid capacity value.");
		}
	}
	
	public void setTicketsSoldByPhone(int ticketsByPhone) {
		if (ticketsByPhone > 0) 
		{
			this.ticketsByPhone = ticketsByPhone;
		}
		else
		{
			System.out.println("Invalid sale value.");
		}
	}
	
	public void setTicketsSoldAtVenue(int ticketsAtVenue) {
		if (ticketsAtVenue > 0)
		{
			this.ticketsAtVenue = ticketsAtVenue;
		}
		else
		{
			System.out.println("Invalid sale value.");
		}
	}
	
	public void setPriceByPhone(double priceByPhone) {
		if (priceByPhone > 0)
		{
			this.priceByPhone = priceByPhone;
		}
		else
		{
			System.out.println("Invalid price by phone.");
		}
	}
	
	public void setPriceAtVenue(double priceAtVenue) {
		if (priceAtVenue > 0)
		{
			this.priceAtVenue = priceAtVenue;
		}
		else
		{
			System.out.println("Invalid price at venue.");
		}
	}
	
	public int totalNumberOfTicketsSold() {
		return ticketsByPhone + ticketsAtVenue;
	}
	
	public int ticketsRemaining() {
		return capacity - totalNumberOfTicketsSold();
	}
	
	public void buyTicketsAtVenue(int numTickets) {
		if (numTickets <= 0)
		{
			System.out.println("You must buy atleast one ticket.");
		}
		
		if (numTickets <=ticketsRemaining())
		{
			ticketsAtVenue += numTickets;
		}
		else
		{
			System.out.println("The Concert is sold out!");
		}
	}
	
	public void buyTicketsByPhone(int numTickets) {
		if (numTickets <= 0)
		{
			System.out.println("You must buy atleast one ticket.");
		}
		
		if(numTickets <= ticketsRemaining())
		{
			ticketsByPhone += numTickets;
		}
		else
		{
			System.out.println("The Conert is sold out!");
		}
	}
	
	public double totalSales() {
		return (priceAtVenue * ticketsAtVenue) + (priceByPhone * ticketsByPhone);
	}

}
