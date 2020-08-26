
public abstract class Bird {
	
	// PROPERTIES OF BIRD.
	int height;
	int weight;
	int numberOfFeathers;
	String colorOfBird;
	
	// Constructor.
	public Bird (int height, int weight, int numberOfFeathers, String colorOfBird) {
		this.height = height;
		this.weight = weight;
		this.numberOfFeathers = numberOfFeathers;
		this.colorOfBird = colorOfBird;
	}
	
	// TWO ABSTRACT METHODS.
	// The sound() method outputs the type of sound.
	public abstract void sound();
	// The layEggs() method outputs whether the bird lays eggs or not.
	public abstract void layEggs();
	
	// TWO NON-ABSTRACT METHODS.
	// The eat() method outputs The bird is eating...
	public void eat() {
		System.out.println("The bird is eating...");
	}
	public void eat(String item) {
		
	}
	// The migrate() method outputs The bird is migrating...
	public void migrate() {
		System.out.println("The bird is migrating...");
	}
	
	// The display() method displays all the properties.
	public void display() {
		System.out.println("Height: " + this.height + " cm.");
		System.out.println("Weight: " + this.weight + " Kg.");
		System.out.println("Number of Feathers: " + this.numberOfFeathers);
		System.out.println("Color of Bird: " + this.colorOfBird);
	}
	
}
