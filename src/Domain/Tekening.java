package Domain;

import java.util.ArrayList;

public class Tekening {
	private String naam;
	private static final int MIN_X = 0;
	private static final int MIN_Y = 399;
	private static final int MAX_X = 399;
	private static final int MAX_Y = 399;
	private ArrayList<Vorm> vormen = ArrayList<>();
	
	public Tekening(String naam) {
		setNaam(naam);
	}
	
	private void setNaam(String naam) {
		if(naam.trim().equals("") || naam == null) throw new DomainException();
		this.naam = naam;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public void voegToe(Vorm vorm) {
		if(vorm == null) throw new DomainException();
		boolean found = false;
		for(Vorm v : vormen) {
			if(v.equals(vorm)) {
				found = true;
			}
		}
		if(!found) {
			vormen.add(vorm);
		}
	}
	
	public int getAantalVormen() {
		return vormen.size();
	}
	
	public void verwijder(Vorm vorm) {
		for(Vorm v : vormen) {
			if(v==vorm) {
				vormen.remove(v);
			}
		}
	}
	
	public boolean bevat(Vorm vorm) {
		for(Vorm v : vormen) {
			if(v==vorm) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		//todo
	}
	
	@Override
	public boolean equals(Object o) {
		//todo
	}
}
