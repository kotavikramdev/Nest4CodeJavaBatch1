
public class Main {
	
	public static void main(String[] args) {
		
		// Creating objects for Parrot, Ostrich and Penguin Classes.
		Parrot parrot = new Parrot(25, 4, 2000, "Green");
		Ostrich ostrich = new Ostrich(200, 110, 5000, "Brown");
		Penguin penguin = new Penguin(40, 25, 20000, "Black-White");
		
		// Parrot.
		System.out.println("Parrot");
		System.out.println("--------------------------");
		parrot.display();
		parrot.sound();
		parrot.layEggs();
		parrot.fly();
		System.out.println();
		
		// Ostrich.
		System.out.println("Ostrich");
		System.out.println("--------------------------");
		ostrich.display();
		ostrich.sound();
		ostrich.layEggs();
		System.out.println();
				
		// Penguin.
		System.out.println("Penguin");
		System.out.println("--------------------------");
		penguin.display();
		penguin.sound();
		penguin.layEggs();
		penguin.swim();
		System.out.println();
		
	}
	
}
