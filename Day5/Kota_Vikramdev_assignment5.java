import java.util.Scanner;

public class Kota_Vikramdev_assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Taking input from user.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int inputNumber = scan.nextInt();
		scan.close();
		
		// Printing 'Half Diamond Star Pattern' using nested loops.
		for (int i = 1; i <= inputNumber; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = inputNumber - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
