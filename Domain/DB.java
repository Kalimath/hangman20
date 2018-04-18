package Domain;

import java.util.ArrayList;

public class DB {
	private ArrayList<Speler> spelers;
	
	public DB() {
		spelers = new ArrayList<>();
	}
	
	public void voegToe(Speler speler) {
		spelers.add(speler);
	}
	
	public int geefGrote() {
		return spelers.size();
	}
}
