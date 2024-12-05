//Christopher Chua
import java.util.Scanner;
public class lab06 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		//ask for height of triangle
		System.out.println("Enter the height of the triangle: ");
		int height = input.nextInt();
		
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int k = height; k > 0; k--)
		{
			for (int l = 0; l < k; l++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
