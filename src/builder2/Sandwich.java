package builder2;

import java.util.ArrayList;

public class Sandwich {
	private String bread;
	private ArrayList<String> spreads;
	private ArrayList<String> meats;
	private ArrayList<String> salads;
	
//	public Sandwich(String bread, List<String> spreads, List<String> meats, List<String> salads) {
//		this.bread = bread;
//		this.spreads = spreads;
//		this.meats = meats;
//		this.salads = salads;
//	}
	
	public Sandwich(Builder builder) {
		bread = builder.bread;
		spreads = builder.spreads;
		meats = builder.meats;
		salads = builder.salads;
	}
	
	
	
	@Override
	public String toString() {
		return "Sandwich [bread=" + bread + ", spreads=" + spreads + ", meats=" + meats + ", salads=" + salads + "]";
	}



	// unutrašnja klasa
	public static class Builder {
		private String bread;
		private ArrayList<String> spreads;
		private ArrayList<String> meats;
		private ArrayList<String> salads;
		
		public Builder(String bread) {
			this.bread = bread;
			spreads = new ArrayList<String>();
			meats = new ArrayList<String>();
			salads = new ArrayList<String>();
		}

		public Builder spread(String spread) {
			spreads.add(spread);
			return this;
		}

		public Builder meat(String meat) {
			meats.add(meat);
			return this;
		}

		public Builder salad(String salad) {
			salads.add(salad);
			return this;
		}
		
		public Sandwich build() {
			return new Sandwich(this);
		}
		
		
	}
	
	

}
