import java.util.Scanner;

public class Kota_Vikramdev_assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Taking two strings as input from user.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String s1 = scan.next();
		System.out.println("Enter String 2: ");
		String s2 = scan.next();
		scan.close();
		
		// Solving problem by replacing first and last two characters.
		String finalS1 = s2.substring((s2.length() - 2), s2.length()) + s1.substring(2, (s1.length() - 2)) + s2.substring(0, 2);
		String finalS2 = s1.substring((s1.length() - 2), s1.length()) + s2.substring(2, (s2.length() - 2)) + s1.substring(0, 2);
		
		// Printing the final Strings.
		System.out.println("String 1: " + finalS1);
		System.out.println("String 2: " + finalS2);
	}

}
