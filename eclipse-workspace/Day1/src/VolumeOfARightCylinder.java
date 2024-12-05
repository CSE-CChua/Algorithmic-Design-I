import java.util.Scanner;


public class VolumeOfARightCylinder {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		double PI = 3.14;
		//double radius = 0;
		//double height = 0;
		
		System.out.println("Enter the radius(in inches) of the cylinder: ");
		
		double radius = key.nextDouble();
		
		System.out.println("Enter the height(in inches) of the cylinder: ");
		double height = key.nextDouble();
		
		double volume = PI * radius * radius * height;
		
		System.out.println("The volume of the cylinder is " + volume);
		

	}

}
