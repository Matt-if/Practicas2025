package tp2;

public class ej8ParcialArboles {
	

	//Puedo ir comparando nodo con nodo
	//caso base es hoja y son iguales ?
	public boolean esPrefijo(BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
		
		if (a1.getData() != a2.getData()) {
			return false;
		}
			
		if (a1.hasLeftChild()) {
			if (a2.hasLeftChild()) {
				if (!this.esPrefijo(a1.getLeftChild(), a2.getLeftChild())) return false;
			}
			else
				return false;
		}
		
		if (a1.hasRightChild()) {
			if (a2.hasRightChild()) {
				if (!this.esPrefijo(a1.getRightChild(), a2.getRightChild())) return false;
			}
			else
				return false;
		}
		
		return true; 
		//Cuando se llega a una hoja que no entro en el primer if, se retorna este true y se empieza a propagar el resultado hacia arriba, 
		// porque si llegaste hasta aca, el camino de nodos superior nunca retorno false.
	}
	
	public static void main(String[] args ) {
		// se que ab1 es prefijo de ab2 y ab3
		BinaryTree<Integer> ab1 = arbolesEjemplo.arbol_Integers_A();
		BinaryTree<Integer> ab2 = arbolesEjemplo.arbol_Integers_B();
		BinaryTree<Integer> ab3 = arbolesEjemplo.arbol_Integers_C();
		
		ej8ParcialArboles arboles = new ej8ParcialArboles();
		
		
		System.out.println(arboles.esPrefijo(ab1, ab2));
		System.out.println(arboles.esPrefijo(ab1, ab3));
		
		System.out.println(arboles.esPrefijo(ab2, ab1));
	}
}
