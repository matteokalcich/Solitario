package boundary;

import java.io.IOException;

import javax.swing.JOptionPane;

import gioco.Config;
import gioco.GiocoDiCarteFactory;


public class SceltaGioco {
	
	private Config c = Config.get();
	
	public void esegui() {
		
		boolean tmp = true;
		
		String sc = "";
		
		int scelta = 0;
		
		do {
			
			sc = JOptionPane.showInputDialog("0) Termina Programma\n1) BlackJack1\n2) Sette e Mezzo\n3) Solitario");
			
			if(sc == null) {
				
				int t = JOptionPane.showConfirmDialog(null, "Sicuro di voler uscire?", "Cancel", JOptionPane.YES_NO_OPTION);
				
				if (t == JOptionPane.YES_OPTION) {
					
					scelta = 0;
					
					tmp = false;
				} else {
					
					tmp = true;
				}

			} else {
				
				try {
					
					scelta = Integer.parseInt(sc);
					tmp = false;
					
				} catch(NumberFormatException e) {
					
					JOptionPane.showMessageDialog(null, "Si prega di inserire un numero", "Errore", JOptionPane.ERROR_MESSAGE);
					tmp = true;
				}
			}
			
			
			
		} while(tmp);
		
		switch(scelta) {
		
		case 0:
			
			JOptionPane.showMessageDialog(null, "Programma Terminato", "Uscita", JOptionPane.OK_OPTION);
			System.exit(0);
			break;
			
		case 1:
			
			JOptionPane.showMessageDialog(null, "Gioco da implementare", "Attenzione", JOptionPane.OK_OPTION);
			break;
			
		case 2:
			
			JOptionPane.showMessageDialog(null, "Gioco da implementare", "Attenzione", JOptionPane.OK_OPTION);
			break;
			
		case 3:
			
			c.setScope(scelta);
			new ConsoleGUI(new GiocoDiCarteFactory().genera());
			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "Si prega di inserire una scelta valida", "Attenzione", JOptionPane.OK_OPTION);
			break;
			
		}
	}

}
