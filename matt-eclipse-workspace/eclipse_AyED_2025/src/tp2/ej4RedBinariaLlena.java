package tp2;

public class ej4RedBinariaLlena {
	private BinaryTree<Integer> arbol;
	
	public ej4RedBinariaLlena(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	private int compararRetardos(BinaryTree<Integer> ab) {
		int sumaIzquierdo = ab.getData();
		int sumaDerecho = ab.getData();
		
		if (ab.hasLeftChild()) {
			sumaIzquierdo += this.compararRetardos(ab.getLeftChild());
		}
		
		if (ab.hasRightChild()) {
			sumaDerecho += this.compararRetardos(ab.getRightChild());
		}
		
		if (sumaDerecho >= sumaIzquierdo) return sumaDerecho;
		else return sumaIzquierdo;
		
	}
	
	public int retardoReenvio () {
		//int max = arbol.getData();
		return compararRetardos(this.arbol);
		
	}
	
	/*
	 Uso un recorrido en profundidad. 
	 Desde cada nodo haces los dos recorridos posibles y comparas cual te dio mas largo.
	 Puede pensarse desde un arbol simple de un nodo y dos hijos, como lo harias ? Raiz + hijoI, Raiz + hijoD y comparas.
	 Despues de comparar sabes cual retornar.
	 */
	public static void main(String[] args) {
		ej4RedBinariaLlena arbolito = new ej4RedBinariaLlena(arbolesEjemplo.arbol_Integers_A());
		
		System.out.println(arbolito.retardoReenvio());
		
		
	}
}
