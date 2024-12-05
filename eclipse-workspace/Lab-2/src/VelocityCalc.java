//Christopher Chua
import java.util.Scanner;

public class VelocityCalc {
	
	public static final double ACCELERATION = 9.8;
	public static void main(String[] args) {
		
		//initialize variables
		Scanner key = new Scanner (System.in);
		
		//Ask for values
		System.out.println("Enter the inital velocity of the ball (in meters per second) at point A:");
		double initialVelocity = key.nextDouble();
		
		System.out.println("How much time (in seconds) does the ball take to reach point B");
		double time = key.nextDouble();
		
		//calculate
		double finalVelocity = initialVelocity + ACCELERATION * time;
		double sq = Math.pow(time,2);
		double distance = initialVelocity * time + (.5) * ACCELERATION * sq;
		
		//print results
		System.out.println("Final velocity of the ball = " + finalVelocity + "m/s");
		System.out.println(" ");
		System.out.println("Distance Traveled by the ball (S) = " + distance + "meters");
	}

}
