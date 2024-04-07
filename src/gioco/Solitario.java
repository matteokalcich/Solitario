package gioco;

import java.awt.Image;

import javax.swing.JOptionPane;

import bean.Carta;
import bean.MazzoFrancese;
import bean.MazzoTriestino;


public class Solitario extends GiocoDiCarte {

	MazzoTriestino mt;
	MazzoFrancese mf;
	String tipMaz;
	int i = 1;
	
	public Solitario() {
		
		tipMaz = getTipoMazzo();
		if(tipMaz.equalsIgnoreCase("triestino")) {
			
			mt = new MazzoTriestino();
			mf = null;
		} else {
			
			mf = new MazzoFrancese();
			mt = null;
		}
	}

	public Image daiCarta() {

		int casuale = (int) (Math.random() * mt.numeroCarte);
		mano.add(mazzo.getCarta(casuale));
		aggiornaPunteggio();
		return mazzo.getCarta(casuale).getImmagine();
	}

	public void aggiornaPunteggio() {

		Carta c = mano.get(mano.size() - 1);
		
		if(mt == null) {
			
			if (c.getFaccia().toLowerCase().contains("jack")) {

				c.setValore(11);
			}
			if (c.getFaccia().toLowerCase().contains("donna")) {

				c.setValore(12);
			}
			if (c.getFaccia().toLowerCase().contains("re")) {

				c.setValore(13);
			}
			
		} else {
			
			if (c.getFaccia().toLowerCase().contains("fante")) {

				c.setValore(8);
			}
			if (c.getFaccia().toLowerCase().contains("cavallo")) {
	
				c.setValore(9);
			}
			if (c.getFaccia().toLowerCase().contains("re")) {
	
				c.setValore(10);
			}
		}

		
		if(c.getValore() == i) {
			
			JOptionPane.showMessageDialog(null, "Hai perso");
		}

		super.punteggio = i++;
	}

	public boolean checkPunteggio() {

		if (super.punteggio != i && i <= 13) {

			return false;
			
		} else if(super.punteggio != i && i > 13){

			i = 0;
			return true;
			
		} else {
			
			return true;
		}
	}

	public boolean checkWin() {

		if (super.punteggio == i) {

			return true;
			
		} else {

			return false;
		}
	}

}
