
public class SwitchObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating objects/instances of Switch class.
		Switch switch1 = new Switch();
		Switch switch2 = new Switch();
		Switch switch3 = new Switch();
		Switch switch4 = new Switch();
		Switch switch5 = new Switch();
		
		// Calling some methods with above objects.
		switch1.quality(true);
		switch2.status(1);
		switch3.quality(false);
		switch4.type("One-Way Switch");
		switch5.type("Two-Way Switch");
		System.out.println("-------------------------------------------------------------");
		
		// Creating objects/instances of SwitchWithConstructor class providing with Inputs.
		SwitchWithConstructor switch_with_constructor_1 = new SwitchWithConstructor(20, 6, 4, "White", "B_Company");
		SwitchWithConstructor switch_with_constructor_2 = new SwitchWithConstructor(25, 7, 5, "White", "B_Company");
		SwitchWithConstructor switch_with_constructor_3 = new SwitchWithConstructor(30, 9, 6, "Grey", "A_Company");
		SwitchWithConstructor switch_with_constructor_4 = new SwitchWithConstructor(15, 5, 4, "White", "C_Company");
		SwitchWithConstructor switch_with_constructor_5 = new SwitchWithConstructor(28, 8, 6, "Grey", "A_Company");
		
		// Displaying properties of each switch.
		System.out.println("Switch - 1: ");
		switch_with_constructor_1.displayProperties();
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("Switch - 2: ");
		switch_with_constructor_2.displayProperties();
		System.out.println("-------------------------------------------------------------");

		System.out.println("Switch - 3: ");
		switch_with_constructor_3.displayProperties();
		System.out.println("-------------------------------------------------------------");

		System.out.println("Switch - 4: ");
		switch_with_constructor_4.displayProperties();
		System.out.println("-------------------------------------------------------------");

		System.out.println("Switch - 5: ");
		switch_with_constructor_5.displayProperties();
		System.out.println("-------------------------------------------------------------");

	}

}
