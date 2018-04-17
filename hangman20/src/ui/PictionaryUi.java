package ui;

import javax.swing.JOptionPane;

import domain.Punt;

public class PictionaryUi {
	
	public PictionaryUi() {}
	public void execute() {
		String x = JOptionPane.showInputDialog("x coordinaat van het punt: ");
		String y = JOptionPane.showInputDialog("y coordinaat van het punt: ");
		int xcoordinaat = Integer.parseInt(x);
		int ycoordinaat = Integer.parseInt(y);
		Punt p = new Punt(xcoordinaat, ycoordinaat);
		JOptionPane.showMessageDialog(null, "U heeft een correct punt aangemaakt: " + p.toString());
	}
}