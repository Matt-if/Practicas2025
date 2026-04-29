package objetos2.ej5_patrones_SustanciasQuimicas;

import java.util.List;

public class ConstructorElementoQuimico {
	
	public UnionQuimica construirUnion (List<ElementoQuimico> elementos) {

		UnionQuimica union = new UnionQuimica(elementos);
		return union;
	}
	
	public Atomo construirOxigeno () {
		return new Atomo("O", 16, -2, false);

	}
	
	public Atomo construirCalcio () {
		return new Atomo("Ca", 40, 2, true);
		
	}
	
	public Atomo construirHidrogeno () {
		return new Atomo("H", 1, 1, false);
		
	}
	
	public Atomo construirSodio () {
		return new Atomo("Na", 23, 1, true);
		
	}
	
	public Atomo construirCloro () {
		return  new Atomo("Cl", 35, -1, false);
		
	}
}
