package tp3;

import java.util.ArrayList;
import java.util.List;

public class ej7Caminos {

	GeneralTree<Integer> arbol;
	
	public ej7Caminos(GeneralTree<Integer> arbol) {
		super();
		this.arbol = arbol;
	}

	private void encontrarCamino(GeneralTree<Integer> ab, List<Integer> caminoMaximo, List<Integer> caminoActual) {
		
		caminoActual.add(ab.getData());
		
		for (GeneralTree<Integer> child : ab.getChildren()) {
			
			this.encontrarCamino(child, caminoMaximo, caminoActual);
			
			if (caminoActual.size() > caminoMaximo.size()) {
				caminoMaximo.clear();
				caminoMaximo.addAll(caminoActual);
			}
			
			caminoActual.remove(caminoActual.size() - 1); // se remueve el ultimo agregado
			
		}
		
	}
	
	public List<Integer> caminoAHojaMasLejana () {
		
		List<Integer> caminoMaximo = new ArrayList<Integer>();
		List<Integer> caminoAux = new ArrayList<Integer>();
		
		if (arbol != null && !arbol.isEmpty())
			encontrarCamino(arbol, caminoMaximo, caminoAux);
		
		return caminoMaximo;
	}
	
	public static void main (String [] args) {
		GeneralTree<Integer> ab = aGeneralesEjemplo.aGeneralIntegers_2();
		
		ej7Caminos test = new ej7Caminos(ab);
		
		System.out.println(test.caminoAHojaMasLejana());
	}
}
