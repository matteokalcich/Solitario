package bean;

import gioco.Config;

public class FiguraFactory {
	
	public Carta getFigura(int primaFigura) {
		
		switch(Config.get().getTipoGioco()) {
		
		case BLACKJACK:
			
			return null;
			
		case SETTEEMEZZO:
			
			return null;
			
		case SOLITARIO:
			
			return new FiguraSolitario(primaFigura);
		}
		
		return null;
	}

}
