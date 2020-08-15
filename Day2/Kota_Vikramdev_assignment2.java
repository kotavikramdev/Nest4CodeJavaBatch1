
public class Kota_Vikramdev_assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sample Input/Output 1:
		float height1 = heightConvertor(5, 11);
		float weight1 = weightConvertor(60);
		System.out.println("Height in cm " + height1);
		System.out.println("Weight in pounds: " + weight1);
		
		// Sample Input/Output 2:
		float height2 = heightConvertor(5, 0);
		float weight2 = weightConvertor(101);
		System.out.println("Height in cm " + height2);
		System.out.println("Weight in pounds: " + weight2);
		
	}
	
	static float heightConvertor(int heightFeetPart, int heightInchPart) {
		// Calculating height in centimeters and assigning it to 'totalHeight' variable.
		float totalHeight = ((float)heightFeetPart * 12 * (float)2.54) + ((float)heightInchPart * (float)2.54);
		return totalHeight;
	}
	
	static float weightConvertor(int weight) {
		// returning weight in pounds
		return (weight * (float)2.2);
	}

}
