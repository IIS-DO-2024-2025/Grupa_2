package strategy;

public class PensionersDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		return amount * 0.25; // 25% popust
	}

}
