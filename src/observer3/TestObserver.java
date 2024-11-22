package observer3;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice price = new CryptoCurrencyPrice();
		
		UpdateSMS update1 = new UpdateSMS();
		price.addListener(update1);
		
		price.setBitcoinPrice(77000);
		price.setEtherPrice(33000);

	}

}
