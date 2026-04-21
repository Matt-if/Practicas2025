package tp3;

import tp1.ejercicio8.Queue;

public class ej4_AnalizadorArbol {
	
	// Me estan pidiendo un promedio de los valores de los nodos por cada nivel del arbol.
	// Entonces lo mas razonable es usar un recorrido por niveles
	
	public double devolverMaximoPromedio (GeneralTree<Integer> arbol) {
		GeneralTree<Integer> ab;
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		int sumaNivelActual = 0, cantNodosNivelAct = 0;
		double promNivelAct, promMax = -1;
		
		if (arbol != null && !arbol.isEmpty()) {
			cola.enqueue(arbol);
			cola.enqueue(null);
		}
				
		while (!cola.isEmpty()) {
			ab = cola.dequeue();
			
			if (ab != null) {
				sumaNivelActual += ab.getData();
				cantNodosNivelAct++;
				for (GeneralTree<Integer> child : ab.getChildren()) {
					cola.enqueue(child);
				}
			}
			else {
				// recordar comparar fuera del otro if porque sino perdemos procesar el ultimo nivel
				promNivelAct = sumaNivelActual / cantNodosNivelAct;
				if (promNivelAct > promMax)
					promMax = promNivelAct;
				
				if (!cola.isEmpty()) {
					cola.enqueue(null);
					sumaNivelActual = 0;
					cantNodosNivelAct = 0;
				}
			}
			
		}
		
		return promMax;
	}
	
	public static void main(String[] args) {
		
		ej4_AnalizadorArbol test = new ej4_AnalizadorArbol();
		
		System.out.println(test.devolverMaximoPromedio(aGeneralesEjemplo.aGeneralIntegers_2()));


	}
}
