package observer3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class UpdateSMS implements PropertyChangeListener {
	
	//observer - listener
	private double bitcoinPrice;
	private double etherPrice;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("bitcoin")) {
			this.bitcoinPrice = (double) evt.getNewValue();
			sendSMS();
		} else if(evt.getPropertyName().equals("ether")) {
			this.etherPrice = (double) evt.getNewValue();
			sendSMS();
		}

	}
	
	public void sendSMS() {
		System.out.println("New bitcoin price is: " + bitcoinPrice);
		System.out.println("New ether price is: " + etherPrice);
	}

}
