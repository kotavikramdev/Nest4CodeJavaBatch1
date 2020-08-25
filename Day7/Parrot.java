
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
	
}
