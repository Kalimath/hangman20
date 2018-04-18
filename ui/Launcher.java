package ui;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Domain.DB;
import Domain.Speler;

public class Launcher {

	public static void main(String[] args) {
		
		ArrayList<Speler> db = new ArrayList<>();
	
		String naam = JOptionPane.showInputDialog("Welkom!!\nHoeheet je?");
		Speler p = new Speler(naam);
		
		db.add(p);
		
		for(int i = 0; i < db.size(); i++) {
			
			JOptionPane.showMessageDialog(null, db.get(i).getNaam()+" heeft score: "+db.get(i).getScore(), db.get(i).getNaam(), JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		
		

	}

}
