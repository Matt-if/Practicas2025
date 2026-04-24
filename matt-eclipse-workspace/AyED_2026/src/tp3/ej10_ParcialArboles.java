package tp3;

import java.util.ArrayList;
import java.util.List;

public class ej10_ParcialArboles {

	/*
	 * 	 
	Hay dos formas de resolverlo:
	1. Uando un obeto Resultado, que mantiene caminoMaximo y valorMaximo, que es de ese camino. Lo voy pasando por parametro para comparar con camino actual
	2. Pasar por parametro la lista resultado en vez del obeto, y para controlar el maximo tengo que ir retornandolo.
	Ambos Pre Orden
	 * 
	 * Logica opcion 2:
	 * 
	 * Recorrido en PreOrden.
	 * 
	 * Metodo auxiliar va a manejar el arbol, caminoActual, caminoMax, nivelActual, sumaActual 
	 * y retornar el valor maximo (correspondiente al calculo que nos piden del caminoMax)
	 * 
	 * Incrementar sumaActual
	 * 
	 * Si soy == 1 
	 *  - add del nodo a caminoActual
	 * 
	 * Si tengo hijos
	 *  - Entro en recursion con cada uno
	 * 	- Si soy == 1 me elimino de la lista cuando vuelvo de la rec.
	 * 
	 * Si soy hoja
	 *  - comparo valorMax de caminoActual con valorMax de caminoMax (puedo usar una funcion que calcule)
	 *  - Si caminoActual es de > valor maximo que el caminoMaximo anterior ahora caminoMaximo es ese 
	 *  
	 *  retorno el valor maximo de caminoMax (que, hasta el momento, es el que debo retornar)

	*
	*/
	
	private static void recorrido_v1(GeneralTree<Integer> arbol, List<Integer> camAct, List<Integer> camMax, int sumaActual, int nivelAct) {
		
	}
	
	private static int recorrido_v2(GeneralTree<Integer> arbol, List<Integer> camAct, List<Integer> camMax, int sumaActual, int nivelAct) {
		
		return 1;
	}
	
	public static List<Integer> resolver(GeneralTree<Integer> arbol) {
		
		List<Integer> caminoActual = new ArrayList<Integer>();
		List<Integer> caminoMax = new ArrayList<Integer>();
		List<Integer> nivelNodoCamMaximo = new ArrayList<Integer>(); // guardo el nivel de cada nodo 1 que guarde.
		
		if (arbol != null && !arbol.isEmpty())
			recorrido_v1(arbol, caminoActual, caminoMax, 0, 0);
		
		return caminoMax;
		
		
	}
}
