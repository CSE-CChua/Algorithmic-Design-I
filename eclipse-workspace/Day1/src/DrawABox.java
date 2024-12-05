import java.util.Scanner;
public class DrawABox {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the heigh of the box: ");
		
		int height = input.nextInt();
		
		System.out.println("Enter the width of the box: ");
		
		int width = input.nextInt();
		
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
