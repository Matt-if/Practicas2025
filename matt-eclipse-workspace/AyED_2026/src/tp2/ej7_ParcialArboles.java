package tp2;

import tp1.ej7;

public class ej7_ParcialArboles {
	BinaryTree<Integer> arbolito;

	public ej7_ParcialArboles(BinaryTree<Integer> arbolito) {
		super();
		this.arbolito = arbolito;
	}
	
	public BinaryTree<Integer> getArbolito() {
		return arbolito;
	}

	private int buscarArbolesConUnicoHijo (BinaryTree<Integer> ab) {
		int total = 0;
		if (ab.hasLeftChild() && ab.hasRightChild()) {
			total += this.buscarArbolesConUnicoHijo(ab.getLeftChild()) + 
					this.buscarArbolesConUnicoHijo(ab.getRightChild());
		}
		
		else {
			if (ab.hasLeftChild() && !ab.hasRightChild()) {
				total += 1 + this.buscarArbolesConUnicoHijo(ab.getLeftChild());
			}
			if (!ab.hasLeftChild() && ab.hasRightChild()) {
				total += 1 + this.buscarArbolesConUnicoHijo(ab.getRightChild());
			}
		}
		return total;

	}
	
	// Se puede hacer mejor esta busqueda ???
	private BinaryTree<Integer> buscarNodo (BinaryTree<Integer> ab, int num) {
		BinaryTree<Integer> nodo = null;
		
		if (ab.getData() == num)
			nodo = ab;
		else {
				if (ab.hasLeftChild()) {
					nodo = this.buscarNodo(ab.getLeftChild(), num);
				}
				
				if (nodo != null)
					return nodo;
				
				if (ab.hasRightChild()) {
					nodo = this.buscarNodo(ab.getRightChild(), num);
				}
			}
		return nodo;
	}
	
	public boolean isLeftTree (int num) {
		int arbolesUnicoHijo_izq = -1, arbolesUnicoHijo_der = -1;
		
		if (this.arbolito != null && !this.arbolito.isEmpty()) {
			
			BinaryTree<Integer> nodo = this.buscarNodo(this.arbolito, num);
			
			if (nodo != null) {
				if (nodo.hasLeftChild()) {
					arbolesUnicoHijo_izq = buscarArbolesConUnicoHijo(nodo.getLeftChild()); 
				}
				
				if (nodo.hasRightChild()) {
					arbolesUnicoHijo_der = buscarArbolesConUnicoHijo(nodo.getRightChild());
				}
				
				return arbolesUnicoHijo_izq > arbolesUnicoHijo_der; 
			}
		}
		
		return false;
	}
	/*
	 * 1. Primero buscamos el nodo con el dato num.
	 * 		si no esta --> false
	 * 		si solo tiene rama izq --> true
	 * 		si solo tiene rama der --> mandarla a analizar
	 * 2. Si tiene ambas ramas --> mandar ambas a analizar
	 * 
	 */
	
	public static void main (String [] args) {
		ej7_ParcialArboles test = new ej7_ParcialArboles(arbolesEjemplo.arbol_Integers_B());
		
		//Primero controle que estemos buscando bien el nodo, igual podriamos preguntar si se puede hacer mejor supongo.
		/*
						   40
					25			78
				10		32
			1
		*/
		//BinaryTree<Integer> nodoEncontrado = test.buscarNodo(test.getArbolito(), 25);
		//nodoEncontrado.printInorden();
		
		// test del problema completo
		System.out.println(test.isLeftTree(10));
		
	}
	

}
