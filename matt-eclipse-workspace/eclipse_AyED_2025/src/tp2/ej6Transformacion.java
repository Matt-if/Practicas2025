package tp2;

public class ej6Transformacion {
	private BinaryTree<Integer> arbol;

	public ej6Transformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public int transformarArbol(BinaryTree<Integer> ab, BinaryTree<Integer> nuevo ) {
		int totalRecorrido = 0;
		
		if (ab.hasLeftChild()) {
			nuevo.addLeftChild(new BinaryTree<Integer>(0));
			
			totalRecorrido += this.transformarArbol(ab.getLeftChild(), nuevo.getLeftChild());
		}
		
		if (ab.hasRightChild()) {
			nuevo.addRightChild(new BinaryTree<Integer>(0));
			
			totalRecorrido += this.transformarArbol(ab.getRightChild(), nuevo.getRightChild());
		}
		
		nuevo.setData(totalRecorrido);

		return totalRecorrido + ab.getData(); //Esta fue la unica linea que tuve que cambiar despues de intentar resolverlo solo y pensarlo bien!!
		//No me puedo quejar, estuve a nada xd.
		// El error estaba en que yo retornaba solo ab.getData() entonces solo devolvia valor del nodo actual en vez de lo acumulado, al propagar para arriba.
		// Por eso faltaba sumar el 10 y el 32 en el valor final de la raiz.
		//Por ejemplo, viendo desde el nodo 25, al propagar para arriba solo llegaba el valor 25 para sumar y no el total de hacer "25+10+32"

	}
	
	public BinaryTree<Integer> suma () {
		BinaryTree<Integer> abNuevo = new BinaryTree<Integer>(0);
		
		transformarArbol(arbol, abNuevo);
		
		return abNuevo;
	}
	
	/*
	 * Recorrer en profundidad, caso base hoja retorna 0.
	 * Vamos agregando un nuevo nodo al arbol nuevo a medida que sabemos que existen en el original.
	 * Se setea el valor de los nodos nuevos en funcion del recorrido de los subarboles de "ese nodo" del original
	 */
	public static void main(String[] args) {
		
		BinaryTree<Integer> aEjemplo = arbolesEjemplo.arbol_Integers_A();
		
		aEjemplo.printInorden(); System.out.println("====");
		
		ej6Transformacion arbol = new ej6Transformacion(aEjemplo);
		
		BinaryTree<Integer> arbolTransformado = arbol.suma();
		
		arbolTransformado.printInorden();
	}
	
	
}
