package tp2;

import tp1.Queue;

public class ej5ProfundidadDeArbolBinario {
	private BinaryTree<Integer> arbol;

	public ej5ProfundidadDeArbolBinario(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public int sumaElementosProfundidad (int p) {
		BinaryTree<Integer> temp;
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		int nivel = 0, suma = 0;
		
		cola.enqueue(this.arbol);
		cola.enqueue(null);
		
		while (!cola.isEmpty() && nivel <= p) {
			temp = cola.dequeue();
				
			if (temp != null) {
				
				if (nivel == p) 
					suma+= temp.getData(); 
				
				if (temp.hasLeftChild()) 
					cola.enqueue(temp.getLeftChild());
				
				if (temp.hasRightChild()) 
					cola.enqueue(temp.getRightChild());
			}
			else if (!cola.isEmpty()) {
				nivel++;
				cola.enqueue(null);
			}
		}
		
		return suma;
	}
	
	/*
	 El metodo tiene que retornar la suma de todos los nodos del árbol que se encuentren a la profundidad pasada como argumento.
	Idea: me sirve usar el recorrido por niveles porque cuando detecto que estoy en la profundidad pedida por parametro
	, osea el nivel, puedo empezar a sumar el resultado final que me piden.
	 */
	
	// profundidad 0 seria la raiz del arbol
	
	//Termina siendo un recorrido por niveles y muy parecido al printEntreNiveles() ya implementado.
	
	public static void main (String[] args) {
		ej5ProfundidadDeArbolBinario arbolin = new ej5ProfundidadDeArbolBinario(arbolesEjemplo.arbol_Integers_A());
		
		System.out.println(arbolin.sumaElementosProfundidad(0));
	}
}
