package bean;

import java.awt.Image;

public class FiguraSolitario extends Carta implements TipoFiguraTriestina {
	
	public FiguraSolitario(int primaFigura) {
		
		super(primaFigura);
	}
	
	public void setValore(int valore) {
		
		this.valore = 10;
	}
	
	public void setFaccia(int f) {
		
		faccia = TipoFiguraTriestina.figura[f-primaFigura];
	}
	
	public void setImmagine(Image immagine) {
		
		super.setImmagine(immagine);
	}

}
