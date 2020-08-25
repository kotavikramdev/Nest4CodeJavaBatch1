
public class Penguin extends Bird implements SwimBehaviour {
	
	// Constructor.
	public Penguin(int height, int weight, int numberOfFeathers, String colorOfBird) {
		super(height, weight, numberOfFeathers, colorOfBird);
	}
	
	// Methods.
	public void sound() {
		System.out.println("Penguins makes sneezing sounds.");
	}
	
	public void layEggs() {
		System.out.println("Penguins lays eggs too.");
	}
	
	public void swim() {
		System.out.println("Penguins can swim.");
	}
	
}
