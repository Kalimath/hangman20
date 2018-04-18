package Domain;

public class Rechthoek {
	private int breedte;
	private int hoogte;
	private Punt linkerBovenHoek;

	public Rechthoek(Punt linkerBovenHoek, int breedte, int hoogte) {
		setBreedte(breedte);
		setHoogte(hoogte);
		setLinkerBovenHoek(linkerBovenHoek);
	}

	public int getBreedte() {
		return breedte;
	}

	public void setBreedte(int breedte) {
		if (breedte <= 0)
			throw new DomainException("breedte moet groter dan 0 zijn");
		this.breedte = breedte;
	}

	public int getHoogte() {
		return hoogte;
	}

	public void setHoogte(int hoogte) {
		if (hoogte <= 0)
			throw new DomainException("hoogte moet groter dan 0 zijn");
		this.hoogte = hoogte;
	}

	public void setLinkerBovenHoek(Punt linkerBovenHoek) {
		if (linkerBovenHoek == null)
			throw new DomainException("De positie mag niet leeg zijn.");
		this.linkerBovenHoek = linkerBovenHoek;
	}

	public Punt getLinkerBovenhoek() {
		return linkerBovenHoek;
	}

	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			result = false;

		else {
			Rechthoek r = (Rechthoek) o;
			if (r.getLinkerBovenhoek().equals(this.getLinkerBovenhoek())
				&& r.getBreedte() == this.getBreedte()
					&& r.getHoogte() == this.getHoogte()) {
						result = true;
			}
		}
		return result;
	}

}