package Domain;

public class Lijnstuk {
	
	private Punt startpunt, eindpunt;
	public Lijnstuk(Punt start, Punt eind) {
		setStartEnEindPunt(start, eind);
	}

	private void setStartEnEindPunt(Punt start, Punt eind) {
		if(start==null||eind==null) throw new DomainException();
		if(start.equals(eind)) throw new DomainException();
		else {
			this.startpunt = start;
			this.eindpunt = eind;
		}
		
	}

	public Punt getStartpunt() {
		return this.startpunt;
	}

	public Punt getEindpunt() {
		return this.eindpunt;
	}
	
	@Override
	public boolean equals(Object o) {
		
		boolean result = false;
		if(o==null) return result;
	    if (o instanceof Lijnstuk) {
	    	Lijnstuk ob = (Lijnstuk)o;
		    
		    if(this.getEindpunt().equals(ob.getEindpunt())
		    	&&this.getStartpunt().equals(ob.getStartpunt())) {
		    	result=true;
		    }
	    }
	    
		return result;
	}
	
	@Override
	public String toString() {
		String uit = "Lijn: startpunt: "+this.getStartpunt()+ " - eindpunt: "+this.getEindpunt();
		return uit;
		
	}

}
