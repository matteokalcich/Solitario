package bean;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import boundary.CaricatoreImmagini;


public class MazzoFrancese extends Mazzo implements TipoMazzoFrancese {
	
	public MazzoFrancese() {
		
		super.numeroCarte = TipoMazzoFrancese.numeroCarte;
		super.numeroCartePerSeme = TipoMazzoFrancese.numeroCartePerSeme;
		super.primaFigura = TipoMazzoFrancese.primaFigura;
		
		super.semi = getSemi();
		super.immagini = caricaImmagini();
		
		mazzo = new Carta[TipoMazzoFrancese.numeroCarte];
	}
	
	public ArrayList<String> getSemi() {
		
		SemiFrancesi semiEnum[] = SemiFrancesi.values();
		
		ArrayList<String> alSemi = new ArrayList<>();
		
		for(SemiFrancesi s : semiEnum) {
			
			alSemi.add(s.name());
		}
		
		return alSemi;
	}
	
	public String getSeme(int i) {
		
		return null;
	}
	
	public List<Image> caricaImmagini(){
		
		return new CaricatoreImmagini().caricaImmagini();
	}

	
	

}
