package bean;

import java.awt.Image;

public class Carta {
	
	private String seme;
	protected double valore;
	protected int primaFigura;
	protected String faccia;
	protected Image immagine;
	
	public Carta(int primaFigura) {
		
		this.primaFigura = primaFigura;
	}

	public String getSeme() {
		return seme;
	}

	public void setSeme(String seme) {
		this.seme = seme;
	}

	public double getValore() {
		return valore;
	}

	public void setValore(double valore) {
		this.valore = valore;
	}

	public int getPrimaFigura() {
		return primaFigura;
	}

	public void setPrimaFigura(int primaFigura) {
		this.primaFigura = primaFigura;
	}

	public String getFaccia() {
		return faccia;
	}

	public void setFaccia(int f) {

		this.faccia = f == 1 ? "A":
			f < primaFigura ? "" + f: "";
	}

	public Image getImmagine() {
		return immagine;
	}

	public void setImmagine(Image immagine) {
		this.immagine = immagine;
	}
	
	@Override
	public String toString() {
		
		return getFaccia() + " " + getSeme() + " " + getValore();
	}
	
	

}
