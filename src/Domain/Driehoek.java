package Domain;

public class Driehoek {
	private Punt hoekPunt1;
	private Punt hoekPunt2;
	private Punt hoekPunt3;
	public Driehoek(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3) {
		setHoekPunten(hoekPunt1, hoekPunt2, hoekPunt3);
	}
	
	private void setHoekPunten(Punt hoekPunt1, Punt hoekPunt2, Punt hoekPunt3) {
		if(hoekPunt1 == null || hoekPunt2 == null || hoekPunt3 == null) throw new DomainException();
		if(hoekPunt1.equals(hoekPunt2) || hoekPunt1.equals(hoekPunt3) || hoekPunt2.equals(hoekPunt3)) throw new DomainException();
		else {
			this.hoekPunt1 = hoekPunt1;
			this.hoekPunt2 = hoekPunt2;
			this.hoekPunt3 = hoekPunt3;
		}
	}
	
	public Punt getHoekPunt1() {
		return hoekPunt1;
	}

	public Punt getHoekPunt2() {
		return hoekPunt2;
	}
	public Punt getHoekPunt3() {
		return hoekPunt3;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		Driehoek d = (Driehoek) o;
		if(this.hoekPunt1 == d.hoekPunt1 && this.hoekPunt2 == d.hoekPunt2 && this.hoekPunt3 == d.hoekPunt3) return true;
		else return false;
	}
	
	@Override
	public String toString() {
		return "hoekpunt1: " + this.hoekPunt1.toString() + ", hoekpunt2: " + this.hoekPunt2.toString() + ", hoekpunt3: " + this.hoekPunt3.toString();
	}
	
}
