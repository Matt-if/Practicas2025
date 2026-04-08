package tp2;

import tp1.ejercicio8.Queue;

public class ej5_ProfundidadDeArbolBinario {
	BinaryTree<Integer> arbol;
	
	public ej5_ProfundidadDeArbolBinario(BinaryTree<Integer> arbol) {
		super();
		this.arbol = arbol;
	}

	// Devuelve la suma de todos los nodos del árbol que se encuentren a la profundidad pasada como argumento
	// Conviene usar un recorrido por niveles !
	public int sumaElementosProfundidad (int p) {
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		BinaryTree<Integer> ab;
		cola.enqueue(this.arbol);
		int profundidad = 0, suma = 0;
		
		while (!cola.isEmpty() && profundidad <=p) {
			int colaSize = cola.size();
			for (int i=0; i < colaSize; i++) {
				ab = cola.dequeue();
				
				if (profundidad == p)
					suma += ab.getData();
				
				if (profundidad < p) {
					if (ab.hasLeftChild())
						cola.enqueue(ab.getLeftChild());
					if (ab.hasRightChild())
						cola.enqueue(ab.getRightChild());
				}
			}
			profundidad++;
			
		}
		return suma;
		
	}
	
	// Version "clasica" con el algoritmo de la catedra, sin el for loop interno:
	
			
	public static void main(String[] args) {
		ej5_ProfundidadDeArbolBinario test = new ej5_ProfundidadDeArbolBinario(arbolesEjemplo.arbol_Integers_A());
		
		System.out.println(test.sumaElementosProfundidad(2));

	}

}
