package observer2;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice price = new CryptoCurrencyPrice();
		
		UpdateSMS update1 = new UpdateSMS();
		price.addObserver(update1);
		
		price.setBitcoinPrice(44000);
		price.setEtherPrice(22000);

	}

}
