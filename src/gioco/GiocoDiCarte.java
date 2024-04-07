package gioco;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import bean.Carta;
import bean.Mazzo;
import bean.MazzoFactory;


public abstract class GiocoDiCarte {

	protected Mazzo mazzo = null;
	protected float punteggio = 0;
	protected ArrayList<Carta> mano = null;
	
	public GiocoDiCarte() {
		
		mano = new ArrayList<Carta>();
		nuovaMano();
	}
	
	public List<Image> mostramazzo() {
		
		return mazzo.getImages();
	}
	
	public float getPunteggio() {
		
		return punteggio;
	}
	
	public Image getRetro() {
		
		return mazzo.getRetro();
	}
	
	public String daiDescrizione() {
		
		Carta c = mano.get(mano.size() - 1);
		return c.toString();
	}
	
	public void nuovaMano() {
		
		mazzo = new MazzoFactory().genera();
	}
	
	public String getTipoMazzo() {
		
		if(mazzo.getNumeroCartePerSeme() == 10) {
			
			return "triestino";
		} else {
			
			return "francese";
		}
	}
	
	public void setPunteggio() {
		
		punteggio = 0;
	}
	
	public abstract Image daiCarta();
	public abstract void aggiornaPunteggio();
	public abstract boolean checkPunteggio();
	public abstract boolean checkWin();
}
