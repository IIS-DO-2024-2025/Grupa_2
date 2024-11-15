package adapter;

// I način - kompozicija
public class BoatAdapter implements Vehicle {
	private Boat boat;	

	public BoatAdapter(Boat boat) {
		this.boat = boat;
	}

	@Override
	public void goFaster() {
		boat.rowFaster();

	}

}
