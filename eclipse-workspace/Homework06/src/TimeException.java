
public class TimeException extends Exception {
	
	//default Constructor
	public TimeException() {
		super("EXCEPTION Invalid time entered.");
		System.out.println("Exception: Invalid time entered.");
		}
	
	public TimeException(String message) {
		super(message);
	}

}
