package domain;

import javax.swing.JOptionPane;

public class Speler {
	private String naam;
	private int score;

	public Speler(String naam) {
		setNaam(naam);
		setScore(score);
	}

	private void setNaam(String naam) {
		if (naam == null) {
			throw new DomainException("Naam is null");
		}

		if (naam.trim().isEmpty() == true) {
			throw new DomainException("Lege naam");
		}

		this.naam = naam;
	}

	private void setScore(int score) {
		this.score = score;
	}

	public String getNaam() {
		return naam;
	}

	public int getScore() {
		return score;
	}
	
	public boolean equals(Speler speler) {
		if (speler == null) return false;
		if (getClass() != speler.getClass()) return false;
		
		else {
			if (naam.trim().toLowerCase().equals(speler.getNaam().trim().toLowerCase())) {
				if (speler.getScore() == this.getScore())
					return true;
			}
			return false;
		}
	}

	public void addToScore(int score) {
		if (score < 0 && score + this.score < 0)
			throw new DomainException("Negatieve score");
		else
			this.score = this.score + score;
	}
	
	//GitKraken geeft mij psychopatische trekken

	@Override
	public String toString() {
		String uit = "";
		uit += "Speler: " + this.getNaam() + "\nMet score " + this.getScore();

		return uit;
	}

}
