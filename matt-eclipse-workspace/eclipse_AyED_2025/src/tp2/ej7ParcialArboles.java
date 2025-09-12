package tp2;

public class ej7ParcialArboles {
	private BinaryTree<Integer> arbol;
	
	public ej7ParcialArboles(BinaryTree<Integer> arbol) {
		super();
		this.arbol = arbol;
	}

	private int contarUnicosHijos(BinaryTree<Integer> ab) {
		int total = 0;
		
		//Condiciones que controlan cuando contar
		if (!ab.isEmpty()) {
			if (ab.isLeaf()) return 0;
			else {
				if (ab.hasLeftChild() && !ab.hasRightChild()) total++;
				if (!ab.hasLeftChild() && ab.hasRightChild()) total++;
				
				if (ab.hasLeftChild()) {
					return total += this.contarUnicosHijos(ab.getLeftChild());
				}
				if (ab.hasRightChild()) {
					return total += this.contarUnicosHijos(ab.getRightChild());
				}
			}
		}
		
		return total;
		
	}
	
	// No hay que olvidarse de propagar el resultado hacia arriba y controlar los nodos vacios
	private BinaryTree<Integer> encontrarN (BinaryTree<Integer> ab, int n) {
		
		BinaryTree<Integer> res = null, aux = null;
		
		if (!ab.isEmpty()) {
			
			if (ab.getData() != n) {
				if (ab.hasLeftChild()) {
					aux = this.encontrarN(ab.getLeftChild(), n);
					if (aux != null) res = aux;
				}
				if (ab.hasRightChild()) {
					aux = this.encontrarN(ab.getRightChild(), n);
					if (aux != null) res = aux;
				}
			}
			else {
				
				return ab;
	
			}
		}
		return res;
	}
	
	public boolean isLeftTree (int num) {
		int izq = -1, der = -1;
		
		if (!this.arbol.isEmpty()) {
			
			BinaryTree<Integer> subArbol = this.encontrarN(this.arbol, num);
			
			if (subArbol != null) {
				//System.out.println("se encontro: " + subArbol.getData());
				if (subArbol.hasLeftChild()) 
					izq = contarUnicosHijos(subArbol.getLeftChild());
				
				if (subArbol.hasRightChild()) 
					der = contarUnicosHijos(subArbol.getRightChild());
			}
			System.out.println(izq + " > " + der);
			return izq > der;
		}
		
		return false;
	}
	
	/*
	 * Recorrido en profundidad. 
	 * Mientras no llegamos al "nodo == num", seguimos recorriendo.
	 * Si llegamos a "nodo == num" --> mandamos subArb izquierdo y derecho a:
	 * - contar raices de que cumplan con la condicion (que tengan un solo un hijo).
	 */
	
	public static void main(String[] args) {
		BinaryTree<Integer> arb = arbolesEjemplo.arbol_Integers_C();
		
		ej7ParcialArboles ab = new ej7ParcialArboles(arb);
		
		/*
		System.out.println(ab.isLeftTree(25)); // true
		System.out.println(ab.isLeftTree(40)); // true
		System.out.println(ab.isLeftTree(10)); // true
		System.out.println(ab.isLeftTree(32)); // false
		System.out.println(ab.isLeftTree(78)); // false
		System.out.println(ab.isLeftTree(0)); // false
		*/
		
		System.out.println(ab.isLeftTree(25)); 
		
		
	}
}
