package Domain;

public class Cirkel {

	private int middelPunt;
	private int radius;
	
	public Cirkel(Punt punt, int radius) {
		setRadius(radius);
		setMiddlePunt(middelPunt);
	}
	
	public void setMiddlePunt(Punt middelPunt) {
		this.middelPunt = middelPunt;
	}
	
	public int getMiddelPunt() {
		return middelPunt;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	@Override
	public boolean equals(Object o) {
		
		boolean result = false;
		
		if(o instanceof Cirkel) {
			Cirkel c = (Cirkel) o;
			
			if(this.radius == c.getRadius() && this.middelPunt == c.getMiddelPunt()) {
				result = true;
			}
		}
		
		return result;
		
	}
	
	@Override
	public String toString() {
		
	}
}
