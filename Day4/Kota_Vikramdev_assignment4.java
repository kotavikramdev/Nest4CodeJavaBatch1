import java.util.Scanner;

public class Kota_Vikramdev_assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Taking input number from user.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long inputNumber = scan.nextLong();
		scan.close();
		
		// Declaring counter variables for number of even and odd digits.
		int evenCounter = 0;
		int oddCounter = 0;
		
		// Calculating number of even and odd digits of given number.
		while (inputNumber != 0) {
			int digit = (int)(inputNumber % 10);
			if (digit % 2 == 0) {
				evenCounter++;
			}
			else {
				oddCounter++;
			}
			inputNumber = inputNumber / 10;			
		}
		
		// Printing number of even and odd digits of given number.
		System.out.println("Odd digits: " + oddCounter);
		System.out.println("Even digits: " + evenCounter);
	}

}
