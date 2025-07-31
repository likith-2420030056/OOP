package Examples;
import java.util.Scanner;

public class scan_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a num: ");
		int number = scanner.nextInt();
		
		if(number%2 == 0)
		{
			System.out.println("The Number is even.");
		}
		else
		{
			System.out.println("The Number is Odd.");
		}
		
		scanner.close();
	}
}
