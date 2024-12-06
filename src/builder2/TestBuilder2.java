package builder2;

public class TestBuilder2 {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("Integralna kifla");
		
		builder.spread("urnebes").spread("pavlaka").meat("šunka").salad("zelena");
		builder.spread("kečap");
		Sandwich sandwich = builder.build();
		
		System.out.println(sandwich);

	}

}
