package Domain;

import javax.swing.JOptionPane;

public class Speler {
private String naam;
private int score;

public Speler(String naam) {
	setNaam(naam);
	setScore(score);
}

private void setNaam(String naam) {
	if(naam==null || naam.trim().isEmpty()) {
		throw new DomainException();
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

@Override
public boolean equals(Object o) {
	boolean result = false;
	if(naam.trim().toLowerCase().equals(((Speler) o).getNaam().trim().toLowerCase())) {
		if(((Speler) o).getScore()==this.getScore())
		result = true;
	}
	return result;
}

public void addToScore(int score) {
	this.score = this.score+score;
}

@Override
public String toString() {
	String uit = "";
	uit+="Speler: "+this.getNaam()+"\nMet score "+this.getScore();
	
	return uit;
}


}
