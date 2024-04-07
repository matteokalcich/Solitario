package bean;

import java.awt.Image;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import boundary.CaricatoreImmagini;


public class MazzoTriestino extends Mazzo implements TipoMazzoTriestino {

	public MazzoTriestino() {
		
		super.numeroCarte = TipoMazzoTriestino.numeroCarte;
		super.numeroCartePerSeme = TipoMazzoTriestino.numeroCartePerSeme;
		super.primaFigura = TipoMazzoTriestino.primaFigura;
		
		super.semi = getSemi();
		super.immagini = caricaImmagini();
		
		mazzo = new Carta[TipoMazzoTriestino.numeroCarte];
	}
	
	public ArrayList<String> getSemi() {
		
		SemiTriestini semiEnum[] = SemiTriestini.values();
		
		ArrayList<String> alSemi = new ArrayList<>();
		
		for(SemiTriestini s : semiEnum) {
			
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
