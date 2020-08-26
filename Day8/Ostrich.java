
public class Ostrich extends Bird {
	
	// Constructor.
	public Ostrich(int height, int weight, int numberOfFeathers, String colorOfBird) {
		super(height, weight, numberOfFeathers, colorOfBird);
	}
	
	// Methods.
	public void sound() {
		System.out.println("Ostriches makes bark, hiss sounds.");
	}
	
	public void layEggs() {
		System.out.println("Ostriches lays eggs but only at particular season.");
	}
	
	// Overriding eat() method
	@Override
	public void eat() {
		System.out.println("Ostrich is eating...");
	}
	
	// Overloading eat() method
	public void eat(String item) {
		System.out.println("Ostrich is eating " + item + "...");
	}
		
}
