package tp2;

public class ej4_RedBinaria {

	BinaryTree<Integer> arbol;

	public ej4_RedBinaria(BinaryTree<Integer> arbol) {
		super();
		this.arbol = arbol;
	}
	
	//Elegi hacer un recorrido en profundidad para resolver este ejercicio
	// Otra forma es sumando los recorridos de cada rama, compararlos y retornar cual suma quedo mas grande.
	private int recorrido(int sumaActual, int sumaMax, BinaryTree<Integer> ab) {
		
		sumaActual += ab.getData();
		
		//caso base
		if (ab.isLeaf()) {
			if (sumaActual >= sumaMax)
				sumaMax = sumaActual;
		}
		else {
			if (ab.hasLeftChild())
				sumaMax = this.recorrido(sumaActual, sumaMax, ab.getLeftChild());
			if (ab.hasRightChild()) 
				sumaMax = this.recorrido(sumaActual, sumaMax, ab.getRightChild());
		}
		
		return sumaMax;
	}
	
	public int retardoReenvio() {
		
		if (this.arbol != null && !this.arbol.isEmpty())
			return this.recorrido(0, 0, this.arbol);
		else 
			return 0;
	}
	
	public static void main (String [] args) {
		
		BinaryTree<Integer> arbolito = new arbolesEjemplo().arbol_Integers_A();
		
		ej4_RedBinaria ej4 = new ej4_RedBinaria(arbolito);
		
		System.out.println(ej4.retardoReenvio());
	}
}
