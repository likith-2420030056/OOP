package Examples;
import java.util.Scanner;


public class scan_positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a Num: ");
		int number = scanner.nextInt();
		
		if(number > 0)
		{
			System.out.println("The Number is Positive");
		}
		else if(number < 0)
		{
			System.out.println("The Number is Negative");
		}
		else
		{
			System.out.println("The number is Zero");
		}
		scanner.close();
	}
}
