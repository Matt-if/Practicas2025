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
	 *  - comparo valorMax de caminoActual con valorMax de caminoMax (NO puedo usar una funcion que "calcule" ese max)
	 *  - Si caminoActual es de > valor maximo que el caminoMaximo anterior, ahora caminoMaximo es ese 
	 *  
	 *  retorno el valor maximo de caminoMax para poder comparar cuando termino de armar un camino porque de otra forma no puedo calcularlo.
	 *  Con la lista de 1's no me alcanza porque no se a que nivel pertencia cada uno ya que en su momento, el valorMax se calculo usando la sumaActual
	 *  del camino que se estaba creando.
	*/
	
	private static int recorrido(GeneralTree<Integer> ab, List<Integer> camAct, List<Integer> camMax, int sumaActual, int nivelAct, int sumaMax) {
		sumaActual += ab.getData() * nivelAct;
		
		if (ab.getData().equals(1)) {
			camAct.add(ab.getData());
		}
		
		if (ab.isLeaf()) {
			if (sumaActual > sumaMax) {
				camMax.clear();
				camMax.addAll(camAct);
				sumaMax = sumaActual; // para retornar bien el nuevo valor maximo del camino que vamos a retornar
			}
		}
		
		else {
			for (GeneralTree<Integer> child : ab.getChildren()) {
				sumaMax = recorrido(child, camAct, camMax, sumaActual, nivelAct + 1, sumaMax);
			}
		}
		
		// Back tracking donde cada nodo es responsable de quitarse del camino actual que se estaba armando.
		if (ab.getData().equals(1)) {
			camAct.remove(camAct.size() - 1);
		}
		
		return sumaMax;
	}
	
	public static List<Integer> resolver(GeneralTree<Integer> arbol) {
		
		List<Integer> caminoActual = new ArrayList<Integer>();
		List<Integer> caminoMax = new ArrayList<Integer>();
		
		int controlValorMax = -1;
		
		if (arbol != null && !arbol.isEmpty())
			controlValorMax = recorrido(arbol, caminoActual, caminoMax, 0, 0, 0);
		
		System.out.println(controlValorMax);
		return caminoMax;

	}
	
	public static void main(String[] args) {
		System.out.println(ej10_ParcialArboles.resolver(aGeneralesEjemplo.aDeCerosYUnos()));
	}
}
