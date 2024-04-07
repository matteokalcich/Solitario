package bean;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Mazzo {

	protected Carta mazzo[] = null;
	protected int numeroCarte;
	protected int numeroCartePerSeme;
	protected int primaFigura;
	protected ArrayList<String> semi;
	List<Image> immagini = null;
	
	public void genera() {
		
		for(int i=0; i<numeroCarte; ++i) {
			
			mazzo[i] = isLiscia(i) ? new Carta(primaFigura) : new FiguraFactory().getFigura(primaFigura);
			mazzo[i].setFaccia(i % numeroCartePerSeme + 1);
			mazzo[i].setSeme(semi.get(i / numeroCartePerSeme));
			mazzo[i].setValore(i % numeroCartePerSeme + 1);
			mazzo[i].setImmagine(immagini.get(i));
		}
	}
	
	private boolean isLiscia(int i) {
		
		return i % (numeroCartePerSeme) + 1 < primaFigura;
	}
	
	public Carta getCarta() {
		
		int casuale = (int)(Math.random()*numeroCarte);
		return mazzo[casuale];
	}
	
	public Carta getCarta(int i) {
		
		return mazzo[i];
	}
	
	public Image getRetro() {
		
		return immagini.get(numeroCarte);
	}
	
	public int getNumeroCartePerSeme() {
		
		return numeroCartePerSeme;
	}
	
	public List<Image> getImages() {
		
		List<Image> images = new ArrayList<Image>();
		
		for(int i=0; i<numeroCarte; ++i) {
			
			Carta c = getCarta();
			images.add(c.getImmagine());
		}
		
		return images;
	}
}
