package tp3;

import java.util.LinkedList;
import java.util.List;

public class ej_10_ParcialArboles {

	
	private static void obtenerCaminoMaxFiltrado (GeneralTree<Integer> ab, List<Integer> caminoAct, List<Integer> caminoMax, int nivel, int sumaAct, guardarSuma sumaMax) {
		
		if (ab.getData() == 1) {
			sumaAct += ab.getData() * nivel; 
			caminoAct.add(ab.getData());
		}
		
		if (!ab.isLeaf()) {
			for (GeneralTree<Integer> child : ab.getChildren()) {
				nivel++;
				obtenerCaminoMaxFiltrado(child, caminoAct, caminoMax, nivel, sumaAct, sumaMax);
			}
		}
		else {
			if (sumaAct > sumaMax.getSuma()) {
				caminoMax.clear();
				caminoMax.addAll(caminoAct);
				sumaMax.setSuma(sumaAct);
			}
		}
		
		if (ab.getData() == 1) 
			caminoAct.remove(caminoAct.size() - 1); 
	}
	
	public static List<Integer> resolver(GeneralTree<Integer> arbol) {
		
		List<Integer> caminoFiltradoMaximo = new LinkedList<Integer>();
		
		guardarSuma sumaMax = new guardarSuma();
		
		if (arbol != null && !arbol.isEmpty())
			obtenerCaminoMaxFiltrado(arbol, new LinkedList<Integer>(), caminoFiltradoMaximo, 0, 0, sumaMax);
		
		return caminoFiltradoMaximo;
				
	}
	
	public static void main (String [] args) {
		System.out.println(resolver(aGeneralesEjemplo.aDeCerosYUnos()));
		
		//aGeneralesEjemplo.aDeCerosYUnos().porNiveles();
	}
	
}
