
public class TimeConverter {

	private int hours;
	private int minutes;
	private int seconds;
	private boolean notPM;
	
	//default Constructor
	public TimeConverter() {
		
	this.hours = 0;
	this.minutes = 0;
	this.seconds = 0;
	this.notPM = true;
	}
	
	//paramaterized Constructor
	public TimeConverter(int hours, int minutes, int seconds) throws Exception {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.notPM = true;
	}
	
	//Accessor
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getseconds() {
		return seconds;
	}
	
	public boolean isNotPM() {
		return notPM;
	}
	
	//mutators
	public void setHours(int hours) throws TimeException
	{
		if (hours < 0 || hours >= 24) {
			throw new TimeException("Invalid hour.");
		}
		this.hours = hours;
	}
	
	public void setMinutes(int minutes) throws TimeException
	{
		if (minutes < 0 || minutes >= 60) {
			throw new TimeException("Invalid minutes.");
		}
		this.minutes = minutes;
	}
	
	public void setSeconds(int seconds) throws TimeException
	{
		if (seconds < 0 || seconds >= 60) {
			throw new TimeException("Invalid hour.");
		}
		this.seconds = seconds;
	}
	
	public void setNotPM(boolean notPM)
	{
		this.notPM = notPM;
	}
	
	public void updateTime(int hours, int minutes, int seconds) throws TimeException
	{
		if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) 
		{
			throw new TimeException("Invalid time values.");
		}
		
			this.hours = hours % 12;
			this.minutes = minutes;
			this.seconds = seconds;
			this.notPM = (hours >= 12);
	}
	
	public void updateTime(String time) throws TimeException
	{
		try 
		{
			String[] timeParts = time.split(":");
			if(timeParts.length != 3)
			{
				throw new TimeException("Invalid time format.");
			}
			
			int hours = Integer.parseInt(timeParts[0]);
			int minutes = Integer.parseInt(timeParts[1]);
			int seconds = Integer.parseInt(timeParts[2]);
			 
			 updateTime(hours, minutes, seconds);
		} 
		
		catch (NumberFormatException e) {
			throw new TimeException("Invalid values must be integers.");
		}
		catch (Exception e) {
			throw e;
		}
	}
	
	public void displayTime() {
		String amPM = notPM ? "AM" : "PM" ;
		System.out.printf("%d:%02d:%02d %s%n", hours, minutes, seconds, amPM);
	}
	
}
