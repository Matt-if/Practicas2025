package tp2;

public class ej9ParcialArboles {
	
	private void resolverRecorrido(BinaryTree<Integer> arbol, BinaryTree<ej9dataNodo> ab, int padre, int sumaParcial) {
		
		int sumaParaNodoActual = sumaParcial + arbol.getData();
		
		ab.getData().setSumaDelCamino(sumaParaNodoActual);
		ab.getData().setDifEntrePadreYo(arbol.getData() - padre);
		
		if (arbol.hasLeftChild()) {
			BinaryTree<ej9dataNodo> nuevoNodoIzq = new BinaryTree<ej9dataNodo>(new ej9dataNodo());
			ab.addLeftChild(nuevoNodoIzq);
			this.resolverRecorrido(arbol.getLeftChild(), nuevoNodoIzq, arbol.getData(), sumaParaNodoActual);
			
		}
		
		if (arbol.hasRightChild()) {
			BinaryTree<ej9dataNodo> nuevoNodoDer = new BinaryTree<ej9dataNodo>(new ej9dataNodo());
			ab.addRightChild(nuevoNodoDer);
			this.resolverRecorrido(arbol.getRightChild(), nuevoNodoDer, arbol.getData(), sumaParaNodoActual);
		}

	}
	
	public BinaryTree<ej9dataNodo> sumAndDif(BinaryTree<Integer> arbol) {
		
		if (!arbol.isEmpty()) {
			BinaryTree<ej9dataNodo> ab = new BinaryTree<ej9dataNodo>(new ej9dataNodo());
			
			resolverRecorrido(arbol, ab, 0, 0);
			
			return ab;
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> arbolito = arbolesEjemplo.arbol_Simple();
		
		ej9ParcialArboles test = new ej9ParcialArboles();
		
		BinaryTree<ej9dataNodo> abFinal = test.sumAndDif(arbolito);
		
		abFinal.printInorden();
		
	}
		
		
}
