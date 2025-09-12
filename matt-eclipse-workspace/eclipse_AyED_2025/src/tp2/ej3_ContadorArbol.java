package tp2;

import java.util.ArrayList;
import java.util.List;

public class ej3_ContadorArbol {
	
	BinaryTree<Integer> arbol;
	
	public ej3_ContadorArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public List<Integer> numerosPares () {
		List<Integer> listaPares = new ArrayList<Integer>();
		
		numerosParesInOrden(this.arbol, listaPares);
		//numerosParesPostOrden(this.arbol, listaPares);
		
		return listaPares;
	}
	
	private void numerosParesInOrden(BinaryTree<Integer> ab, List<Integer> listaPares) {
		if (ab.hasLeftChild()) {
			this.numerosParesInOrden(ab.getLeftChild(), listaPares);
		}
		
		if (this.esPar(ab.getData())) listaPares.add(ab.getData());
		
		if (ab.hasRightChild()) {
			this.numerosParesInOrden(ab.getRightChild(), listaPares);
		}
	}
	
	private void numerosParesPostOrden(BinaryTree<Integer> ab, List<Integer> listaPares) {
		if (ab.hasLeftChild()) {
			this.numerosParesPostOrden(ab.getLeftChild(), listaPares);
		}
		
		if (ab.hasRightChild()) {
			this.numerosParesPostOrden(ab.getRightChild(), listaPares);
		}
		
		if (this.esPar(ab.getData())) listaPares.add(ab.getData());
	}
	
	private boolean esPar(int n) {
		return (n % 2 == 0);
	}

	public static void main(String[] args) {
		BinaryTree<Integer> ab = arbolesEjemplo.arbol_Integers_A();
		
		ej3_ContadorArbol conteo = new ej3_ContadorArbol(ab);
		
		List<Integer> Pares = conteo.numerosPares();
		
		for (Integer l: Pares) System.out.println(l);
	}

}
