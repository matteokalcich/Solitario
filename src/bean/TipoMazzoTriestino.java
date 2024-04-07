package bean;

import java.util.List;

public interface TipoMazzoTriestino {

	int numeroCarte = 40;
	int numeroCartePerSeme = 10;
	int primaFigura = 8;
	
	List<String> getSemi();
	String getSeme(int i);
}
