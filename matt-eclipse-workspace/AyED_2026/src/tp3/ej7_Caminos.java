package tp3;

import java.util.ArrayList;
import java.util.List;

public class ej7_Caminos {
	
	GeneralTree<Integer> arbol;
	
	
	/* Nota: cuando manejamos el armado de listas, en general el mismo nodo que se agrega a si mismo,
	 * 	luego de recorrer sus hijos va a eliminarse de la lista actual. Obviamente hay exepciones
	 * pero son bastante pocas.
	 * 
	 * 
	 * Logica para resolverlo (consultada y esta ok):
	 
	 * Uso pre orden y dos listas (actual y maxima). 
	 * - In-orden no me beneficia para resolver, y en general nunca ayuda mucho.
	 * - Post-orden en este caso no conviene porque al tener que recorrer todo el arbol y ver que camino es mas largo,
	 * 		ir armandolo desde las hojas no te facilita el objetivo.
	 * 
	 * El metodo auxiliar no retorna nada
	 * 
	 * Siempre agrego el valor del nodo a la listaActual.
	 * 
	 * Caso base: llego a una hoja y comparo largos de ambas listas.
		- Si la actual es mas larga, hago addAll a la maxima.
		
		En un nodo interno, cuando vuelvo de la recursion de mis hijos, siempre me quito de la listaActual
		
	*/
	
	private void recorridoPre (GeneralTree<Integer> arbol, List<Integer> caminoAct, List<Integer> caminoMax) {
		
	}
	
	// Retorne el camino a la hoja más lejana. 
	// En el caso de haber más de un camino máximo retorne el primero que encuentre
	public List<Integer> caminoAHojaMasLejana () {
		List <Integer> caminoMax = new ArrayList <Integer>(); 
		List <Integer> caminoAct = new ArrayList <Integer>(); 
		
		this.recorridoPre(this.arbol, caminoAct, caminoMax);
		
		return caminoMax;
	}

}
