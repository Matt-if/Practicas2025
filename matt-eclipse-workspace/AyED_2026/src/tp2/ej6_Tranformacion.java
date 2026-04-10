package tp2;

public class ej6_Tranformacion {

	/* A partir de cada nodo, defino el dato del nuevo nodo a partir de la suma de los dos recorridos que se hicieron.
		En cada nodo intermedio:
	 	- hay que crear uno nuevo para el nuevo arbol y los nodos hijo (si aplica)
		- Debe devolver la suma de sus sub arboles
		Caso base es cuando llego a una hoja y esta debe retornar 0
		El agregado de nodos al nuevo arbol es ANTES de hacer un nuevo llamado recursivo, osea que
		no se agregan nuevos nodos desde una hoja.
		
		creo nodo nuevo A
		hago los recorridos de los sub arboles B y C
		A.setData(suma de recorrido B + C)
	*/
	
	private BinaryTree<Integer> arbol;

	public ej6_Tranformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public BinaryTree<Integer> getArbol() {
		return arbol;
	}



	private int transformar (BinaryTree<Integer> ab, BinaryTree<Integer> abN) {
		int sumaIzq = 0, sumaDer = 0;
		
		if (ab.isLeaf()) {
			abN.setData(0);
		}
		else {
			
			if (ab.hasLeftChild()) {
				BinaryTree<Integer> nodoNuevoIzq = new BinaryTree<Integer>();
				abN.addLeftChild(nodoNuevoIzq);
				sumaIzq = this.transformar(ab.getLeftChild(), nodoNuevoIzq);
			}
			if (ab.hasRightChild()) {
				BinaryTree<Integer> nodoNuevoDer = new BinaryTree<Integer>();
				abN.addRightChild(nodoNuevoDer);
				sumaDer = this.transformar(ab.getRightChild(), nodoNuevoDer);
				
			}
			abN.setData(sumaIzq + sumaDer);
		}

		return ab.getData() + sumaIzq + sumaDer;
	}
	
	public BinaryTree<Integer> suma () {
		
		BinaryTree<Integer> nuevo = new BinaryTree<Integer>();
		
		if (arbol != null && !arbol.isEmpty()) {
			this.transformar(this.arbol, nuevo);
		}
		
		return nuevo;
	}
	
	public static void main (String [] args) {
		ej6_Tranformacion test = new ej6_Tranformacion(arbolesEjemplo.arbol_Integers_A());
		
		/* El arbol original:
		 *			   40
		 *		25			80
		 * 10		32
		 */
		test.getArbol().printInorden();
		System.out.println();
		
		BinaryTree<Integer> arbol_transformado = test.suma();
		/* El arbol original transformado:
		 *			   147
		 *		42			0
		 * 0		0
		 */
		arbol_transformado.printInorden(); // deberia imprimir 0  42  0  147  0
		
		
	}
	
}
