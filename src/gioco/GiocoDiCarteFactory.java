package gioco;

public class GiocoDiCarteFactory {
	
	private GiocoDiCarte gioco = null;
	
	public GiocoDiCarte genera() {
		
		Config config = Config.get();
		
		switch(config.getTipoGioco()) {
		
		case BLACKJACK:
			
			return null;
			
		case SETTEEMEZZO:
			
			return null;
			
		case SOLITARIO:
			
			return new Solitario();
		}
		
		return gioco;
	}

}
