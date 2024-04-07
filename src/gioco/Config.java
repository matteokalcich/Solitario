package gioco;

import java.io.File;

public class Config {
	
	private static Config config = null;
	public enum TipoMazzo {FRANCESE, TRIESTINO}
	public enum TipoGioco {BLACKJACK, SETTEEMEZZO, SOLITARIO}
	private TipoMazzo tipoMazzo = TipoMazzo.TRIESTINO;
	private TipoGioco tipoGioco = TipoGioco.SOLITARIO;
	
	private String deckPath;
	
	private Config() {}
	
	public static Config get() {
		
		if(config == null) {
			
			config = new Config();
		}
		
		return config;
	}
	
	public void setScope(int i) {
		
		tipoGioco = tipoGioco.values()[i - 1];
		setTipoMazzo(tipoGioco);
		setDeckPath();
	}
	
	private void setDeckPath() {
		
		deckPath = System.getProperty("user.dir") + File.separator + "resources" + File.separator;
		
		switch(tipoMazzo) {
		
		case FRANCESE:
			
			deckPath += "CARTEFRANCESI";
			break;
			
		case TRIESTINO:
			
			deckPath += "CARTETRIESTINE";
			break;
		}
	}
	
	public String getDeckPath() {
		
		return deckPath;
	}
	
	public TipoGioco getTipoGioco() {
		
		return tipoGioco;
	}
	
	public TipoMazzo getTipoMazzo() {
		
		return tipoMazzo;
	}
	
	public void setTipoMazzo(int i) {
		
		this.tipoMazzo = tipoMazzo.values()[i - 1];
		setDeckPath();
	}
	
	public void setTipoMazzo(TipoGioco tipoGioco) {
		
		switch(tipoGioco) {
		
		case BLACKJACK:
			
			tipoMazzo = tipoMazzo.FRANCESE;
			break;
			
		case SETTEEMEZZO:
			
			tipoMazzo = tipoMazzo.TRIESTINO;
			break;
			
		case SOLITARIO:
			
			tipoMazzo = tipoMazzo.TRIESTINO;
			break;
		}
	}
	
	public void setTipoMazzo(TipoMazzo tm) {
		
		tipoMazzo = tm;
	}

}
