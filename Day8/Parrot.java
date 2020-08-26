
public class Parrot extends Bird implements FlyBehaviour {
	
	// Constructor.
	public Parrot (int height, int weight, int numberOfFeathers, String colorOfBird) {
		super(height, weight, numberOfFeathers, colorOfBird);
	}
	
	// Methods.
	public void sound() {
		System.out.println("Parrots makes screech, squawk sounds.");
	}
	
	public void layEggs() {
		System.out.println("Parrots lays eggs.");
	}
	
	public void fly() {
		System.out.println("Parrots can fly.");
	}
	
	// Overriding eat() method
	@Override
	public void eat() {
		System.out.println("Parrot is eating...");
	}
	
	// Overloading eat() method
	public void eat(String item) {
		System.out.println("Parrot is eating " + item + "...");
	}
	
}
