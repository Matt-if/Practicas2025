package tp2;

import java.util.ArrayList;
import java.util.List;

public class ej3_ContadorArbol {

	BinaryTree<Integer> arbol;
	
	
	
	public ej3_ContadorArbol(BinaryTree<Integer> arbol) {
		super();
		this.arbol = arbol;
	}

	private void recorridoInOrden (List<Integer> lista, BinaryTree<Integer> ab) {
		int dato = ab.getData();
		
		if (ab.hasLeftChild())
			this.recorridoInOrden(lista, ab.getLeftChild());
		if ( dato % 2 == 0)
			lista.add(dato);
		if (ab.hasRightChild())
			this.recorridoInOrden(lista, ab.getRightChild());
	}
	
	private void recorridoPostOrden (List<Integer> lista, BinaryTree<Integer> ab) {
		int dato = ab.getData();
		
		if (ab.hasLeftChild())
			this.recorridoPostOrden(lista, ab.getLeftChild());

		if (ab.hasRightChild())
			this.recorridoPostOrden(lista, ab.getRightChild());
		
		if ( dato % 2 == 0)
			lista.add(dato);
	}
	
	public List<Integer> numerosParesInOrden() {
		
		ArrayList<Integer> pares = new ArrayList<Integer>();
		
		if (this.arbol != null && !this.arbol.isEmpty())
			recorridoInOrden(pares, this.arbol);
		
		return pares;
	}
	
	public List<Integer> numerosParesPostOrden() {
		ArrayList<Integer> pares = new ArrayList<Integer>();
		
		recorridoPostOrden(pares, this.arbol);
		
		return pares;
	}
	
	public static void main (String [] args ) {
		BinaryTree<Integer> arbol = new arbolesEjemplo().arbol_Integers_A();
		
		ej3_ContadorArbol ab = new ej3_ContadorArbol(arbol);
		
		List<Integer> lista = new ArrayList<Integer>();
		
		lista = ab.numerosParesInOrden();
		
		System.out.println(lista);
	}
}
