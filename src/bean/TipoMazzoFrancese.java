package bean;

import java.util.List;

public interface TipoMazzoFrancese {
	
	int numeroCarte = 52;
	int numeroCartePerSeme = 13;
	int primaFigura = 11;
	List<String> getSemi();
	String getSeme(int i);
}
