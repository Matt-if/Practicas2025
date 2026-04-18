package tp2;

public class ej9_ParcialArboles {

	/* - nodo padre tiene que pasar la suma actual y su valor para que el hijo pueda procesarlo.
	 * - recorres todo el arbol, unico caso base es si es hoja para cortar la recursion pero no hay que hacer nada en especial.
	 * - no es necesario retornar valores para usar en el back-tracking.
	 */
	
	private void recorrido(BinaryTree<Integer> arbol, BinaryTree<SumaYDiferencia> nuevoAb, int sumaActual, int dataNodoPadre) {
				
		nuevoAb.setData(new SumaYDiferencia(sumaActual + arbol.getData(), arbol.getData() - dataNodoPadre));
		
		if (arbol.hasLeftChild()) {
			BinaryTree<SumaYDiferencia> hijoIzqDelNuevoNodo = new BinaryTree<SumaYDiferencia>();
			this.recorrido(arbol.getLeftChild(), hijoIzqDelNuevoNodo, sumaActual + arbol.getData(), arbol.getData());
			nuevoAb.addLeftChild(hijoIzqDelNuevoNodo);
		}
		
		if (arbol.hasRightChild()) {
			BinaryTree<SumaYDiferencia> hijoDerechoDelNuevoNodo = new BinaryTree<SumaYDiferencia>();
			this.recorrido(arbol.getRightChild(), hijoDerechoDelNuevoNodo, sumaActual + arbol.getData(), arbol.getData());
			nuevoAb.addRightChild(hijoDerechoDelNuevoNodo);
		}
		
	}
	
	public BinaryTree<SumaYDiferencia> sumAndDif(BinaryTree<Integer> arbol) {
		
		BinaryTree<SumaYDiferencia> nuevoAb = new BinaryTree<SumaYDiferencia>();
		
		if (arbol != null && !arbol.isEmpty())
			this.recorrido(arbol, nuevoAb, 0, 0);
		
		return nuevoAb;
		
	}
	
	public static void main(String[] args) {
		ej9_ParcialArboles test = new ej9_ParcialArboles();
		
		BinaryTree<SumaYDiferencia> resultado;
		
		resultado = test.sumAndDif(arbolesEjemplo.arbol_Simple());
		
		resultado.printPorNiveles();

	}

}
