// Switch Class.
public class Switch {
	
	// Instance Variables or Properties --> State	
	int priceOfSwitch;
	int customerReview;
	int currentCapacity;
	String colorOfSwitch;
	String manufacturerOfSwitch;	
	
	// Instance Methods --> Behavior	
	// status method outputs the state of switch based on 'state' variable.
	public void status(int state) {
		if (state == 1) {
			System.out.println("Switch is ON.");
		} 
		else {
			System.out.println("Switch is OFF.");
		}
	}
	
	// quality method outputs good/damaged based on boolean variable 'qualityOfSwitch'.
	public void quality(boolean qualityOfSwitch) {
		if (qualityOfSwitch == true) {
			System.out.println("The switch is working GOOD.");
		} 
		else {
			System.out.println("The switch is damaged");
		}
	}
	
	// type method outputs the type of switch i.e., One-Way, Two-Way etc. by using 'typeOfSwitch' variable.
	public void type(String typeOfSwitch) {
		System.out.println("The type of Switch is: " + typeOfSwitch);
	}
	
	// displayProperties method outputs all the properties of Switch object.
	public void displayProperties() {
		System.out.println("Price of Switch: Rs." + priceOfSwitch);
		System.out.println("Customer Review of Switch: " + customerReview);
		System.out.println("Maximum Current Capacity of Switch: " + currentCapacity + "Amps");
		System.out.println("Color of Switch: " + colorOfSwitch);
		System.out.println("Manufacturing Company of Switch: " + manufacturerOfSwitch);
	}
}
