import java.util.Scanner;
public class GradeAverage {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		String input = " ";
		
		do
		{
			int gradeCounter = 0;
			double sum = 0, avg = 0;
			
			System.out.println("Enter the grades whose average you want to calculate. Enter a negative number once done: ");
			
			double grade = key.nextDouble();
			
			while (grade >= 0 && grade <= 100)
			{
				sum += grade;
				
				gradeCounter++; //gradeCounter = gradeCounter + 1
				
				grade = key.nextDouble();
			}
			
			if (gradeCounter > 0)
			{
				avg = sum/gradeCounter;
			}
			
			System.out.println("Average = ");
			System.out.printf("%.2f\n" , avg);
			
			System.out.println("Do you want to  calculate the average for another set of grades? Enter \"Yes\" or \"No\" : ");
			
			input = key.next();
		} while(input.equalsIgnoreCase("Yes"));
		
		System.out.println("Exitting the program!!!!");

	}

}
