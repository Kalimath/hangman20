package Domain;

public class Cirkel {

	private Punt middelPunt;
	private int radius;
	
	public Cirkel(Punt middelpunt, int radius) {
		setRadius(radius);
		setMiddlePunt(middelPunt);
	}
	
	public void setMiddlePunt(Punt middelPunt) {
		this.middelPunt = middelPunt;
	}
	
	public Punt getMiddelPunt() {
		return middelPunt;
	}
	
	public void setRadius(int radius) {
		if(radius <= 0) {
			throw new IllegalArgumentException("Radius te klein");
		}
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
			
			if(this.radius == c.getRadius() && this.middelPunt.equals(c.getMiddelPunt())) {
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Crikel met als straal " + radius + " en middelpunt " + middelPunt;
	}
}
