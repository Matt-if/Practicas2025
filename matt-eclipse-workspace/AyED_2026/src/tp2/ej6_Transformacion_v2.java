package tp2;

public class ej6_Transformacion_v2 {

	private BinaryTree<Integer> arbol;

	public ej6_Transformacion_v2(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public BinaryTree<Integer> getArbol() {
		return arbol;
	}


	/* Caso base, 
	 * 	es una hoja, retorna su valor y se setea en 0.
	 * 
	 * Caso recursivo
	 * 		setear su data como la suma de sus dos sub-arboles, luego esa suma + su dato original retornarla.
	 */
	
	private int transformar (BinaryTree<Integer> ab) {
		int suma, sumaIzq = 0, sumaDer = 0, temp;
		
		if (ab.isLeaf()) {
			suma = ab.getData();
			ab.setData(0);
		}
		
		else {
			if (ab.hasLeftChild()) {
				sumaIzq = this.transformar(ab.getLeftChild());
			}
			
			if (ab.hasRightChild()) {
				sumaDer = this.transformar(ab.getRightChild());
			}
			
			temp = ab.getData();
			ab.setData(sumaIzq + sumaDer);
			suma = sumaIzq + sumaDer + temp;
		}
		
		return suma;
	}
	
	public BinaryTree<Integer> suma () {
		
		if (arbol != null && !arbol.isEmpty()) {
			this.transformar(this.arbol);
		}
		
		return this.arbol;
	}
	
	public static void main (String [] args) {
		ej6_Transformacion_v2 test = new ej6_Transformacion_v2(arbolesEjemplo.arbol_Integers_A());
		
		/* El arbol original:
		 *			   40
		 *		25			78
		 * 10		32
		 */
		test.getArbol().printInorden();
		System.out.println();		
		/* El arbol original transformado:
		 *			   145
		 *		42			0
		 * 0		0
		 */
		test.suma();
		test.getArbol().printInorden();
		
	}
}
