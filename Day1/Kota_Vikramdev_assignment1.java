import java.util.Scanner;

public class Kota_Vikramdev_assignment1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// Scanner class is used to take input from the user.
		// sc is the Scanner class object
		Scanner sc = new Scanner(System.in);
				
		// Taking the input of prices of 3 products from user.
		float priceOfProduct1 = sc.nextFloat();
		float priceOfProduct2 = sc.nextFloat();
		float priceOfProduct3 = sc.nextFloat();

		// Taking the input of tax percentage from user.
		float taxPercentage = sc.nextFloat();
	
		// Closing Scanner sc object
		sc.close();
	
		// Calculating the total of 3 products prices.
		float productPrice = priceOfProduct1 + priceOfProduct2 + priceOfProduct3;

		// Calculating the tax amount using the following formula.
		float taxAmount = (taxPercentage / 100) * productPrice;

		// Summing up the 3 products price and tax amount and assigning it to totalPrice variable.
		float totalPrice = productPrice + taxAmount;

		// Printing Final Amount.
		System.out.println("Final Amount: " + totalPrice);
	}

}
