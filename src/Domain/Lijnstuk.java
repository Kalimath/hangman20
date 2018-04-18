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
		return startpunt;
	}

	public Punt getEindpunt() {
		return eindpunt;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if (o == null) return false;
	    if (o == this) return true;
	    if (!(o instanceof Lijnstuk))return false;
	    Lijnstuk ob = (Lijnstuk)o;
	    
	    if(ob.getEindpunt().equals(this.getEindpunt())&&ob.getStartpunt().equals(this.getStartpunt())) {
	    	result=true;
	    }
		return result;
	}
	
	@Override
	public String toString() {
		String uit = "Lijn: startpunt: "+this.getStartpunt()+ " - eindpunt: "+this.getEindpunt();
		return uit;
		
	}

}
