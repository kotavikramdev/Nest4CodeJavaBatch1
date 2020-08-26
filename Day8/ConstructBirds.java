
public class ConstructBirds {
	
	public static void main(String[] args) {
		
		// Creating objects for Parrot, Ostrich and Penguin Classes.
		Bird parrot = new Parrot(25, 4, 2000, "Green");
		Bird ostrich = new Ostrich(200, 110, 5000, "Brown");
		Bird penguin = new Penguin(40, 25, 20000, "Black-White");
		
		// Parrot.
		System.out.println("Parrot");
		System.out.println("--------------------------");
		parrot.eat();
		parrot.eat("fruits");
		System.out.println();
		
		// Ostrich.
		System.out.println("Ostrich");
		System.out.println("--------------------------");
		ostrich.eat();
		ostrich.eat("insects");
		System.out.println();
				
		// Penguin.
		System.out.println("Penguin");
		System.out.println("--------------------------");
		penguin.eat();
		penguin.eat("fish");
		System.out.println();
		
	}
	
}
