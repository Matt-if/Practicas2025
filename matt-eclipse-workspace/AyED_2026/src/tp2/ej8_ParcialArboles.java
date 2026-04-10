package tp2;

public class ej8_ParcialArboles {

	/*
	 * Recordar que estamos viendo si a1 es prefijo de a2
	 - controlo que los arboles no sean null y no esten vacios
	 - Entro a la recursion
	 	- controlo que el nodo en el que estamos sean iguales en ambos arboles
	 		- si no, ya corto la recursion
	 	- consulto si hijo/s que tiene arbol 1 tambien lo tiene el 2.
	 		- si no, corto recursion
	 	- CUANDO CORTAMOS RECURSION, RECORDAR el pasaje del boolean correspondiente
	 	- en el back trackking
	 */
	
	private boolean recorrido (BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
		
		boolean esPref = true;
		
		if (a1.getData().equals(a2.getData())) {
			
			//sacarlo y probar
			if (a1.isLeaf())
				return true;
			
			if (a1.hasLeftChild() && !a2.hasLeftChild()) {
				return false;
				
			}
			
			if (a1.hasRightChild() && !a2.hasRightChild()) {
				return false;
			}
			
			if (a1.hasLeftChild() && a2.hasLeftChild()) {
				esPref = this.recorrido(a1.getLeftChild(), a2.getLeftChild());
			}
			
			if (esPref && a1.hasRightChild() && a2.hasRightChild()) {
					esPref = this.recorrido(a1.getRightChild(), a2.getRightChild());
				}
			return esPref;
	
		}
		else {
			return false;
		}
	}
	
	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		
		if (arbol1 != null && arbol2 != null) {
			if (arbol1.isEmpty() && arbol2.isEmpty())
				return true;
			
			return this.recorrido(arbol1, arbol2);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		ej8_ParcialArboles test = new ej8_ParcialArboles();
		
		System.out.println(test.esPrefijo(arbolesEjemplo.arbol_Integers_A(), arbolesEjemplo.arbol_Integers_B()));
		
		System.out.println(test.esPrefijo(arbolesEjemplo.arbol_Integers_C(), arbolesEjemplo.arbol_Integers_B()));

	}

}
