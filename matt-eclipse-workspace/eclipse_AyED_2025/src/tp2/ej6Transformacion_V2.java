package tp2;

/*
 * La diferencia en esta V2 es que se modifica el mismo arbol que comienza como V.I de la clase, en vez de retornar uno nuevo.
 */

public class ej6Transformacion_V2 {
	private BinaryTree<Integer> arbol;

	public ej6Transformacion_V2(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public int transformarArbol(BinaryTree<Integer> ab ) {
		int totalRecorrido = 0, valorTemp = ab.getData();

		if (ab.hasLeftChild()) {
				
			totalRecorrido += this.transformarArbol(ab.getLeftChild());
		}
		
		if (ab.hasRightChild()) {
			
			totalRecorrido += this.transformarArbol(ab.getRightChild());
		}
		
		ab.setData(totalRecorrido);

		return totalRecorrido + valorTemp;

	}
	
	public BinaryTree<Integer> suma () {
		
		transformarArbol(this.arbol);
		
		return this.arbol;
	}
	
	public static void main(String[] args) {
		
		BinaryTree<Integer> aEjemplo = arbolesEjemplo.arbol_Integers_A();
		
		System.out.println("arbol original in orden: "); 
		aEjemplo.printInorden(); 
		
		ej6Transformacion_V2 arbol = new ej6Transformacion_V2(aEjemplo);
		
		BinaryTree<Integer> arbolTransformado = arbol.suma();
		
		System.out.println("Mismo arbol, transformado, in orden: ");
		arbolTransformado.printInorden();
	}
}

