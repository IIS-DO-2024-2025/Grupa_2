package adapter;

// II način - nasleđivanja
public class BoatAdapter2 extends Boat implements Vehicle{

	@Override
	public void goFaster() {
		rowFaster();
		
	}

}
