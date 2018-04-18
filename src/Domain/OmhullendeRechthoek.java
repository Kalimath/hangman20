public class OmhullendeRechthoek {
	private Punt minX, maxX, minY, maxY;
	private int hoogte, breedte;

	public OmhullendeRechthoek(Punt minX, Punt maxX, Punt minY, Punt maxY) {
		setMaxX(maxX);
		setMaxY(maxY);
		setMinX(minX);
		setMinY(minY);
	}
	
	private void setMinX(Punt minX) {
		this.minX = minX;
	}


	private void setMaxX(Punt maxX) {
		this.maxX = maxX;
	}


	private void setMinY(Punt minY) {
		this.minY = minY;
	}


	private void setMaxY(Punt maxY) {
		this.maxY = maxY;
	}
	
	public void setHoogte(Punt maxY, Punt minY){
		this.hoogte = maxY.getY() -minY.getY();
	}
	
	public void setBreedte(Punt maxX, Punt minX) {
		this.breedte = maxX.getX() - minX.getX();
	}
	
	public Punt getMinX() {
		return minX;
	}


	public Punt getMaxX() {
		return maxX;
	}


	public Punt getMinY() {
		return minY;
	}


	public Punt getMaxY() {
		return maxY;
	}
	
	public int getHoogte() {
		return hoogte;
	}

	public int getBreedte() {
		return breedte;
	}
	
	@Override
	public boolean equals(Object o){
		boolean result = false;
		if(o instanceof OmhullendeRechthoek) {
			OmhullendeRechthoek or =(OmhullendeRechthoek) o;
			if(or.getMinX()==this.getMinX()&&or.getMinY()==this.getMinY()
					&&or.getMaxX()==this.getMaxX()&&or.getMaxY()==this.getMaxY()) {
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Omhullende: ("+ minX.getX()+", "+ minY.getY()+") - "+ this.getBreedte()+" - "+this.getHoogte();
	}




	


	
}
