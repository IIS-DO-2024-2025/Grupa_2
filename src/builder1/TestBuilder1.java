package builder1;

public class TestBuilder1 {

	public static void main(String[] args) {
		CapricciosaBuilder capricciosaBuilder = new CapricciosaBuilder();
		PizzaChef chef = new PizzaChef(capricciosaBuilder);
		
		chef.makePizza();
		
		System.out.println("Napravili smo: " + chef.getPizza());

	}

}
