package tp2;

public class ej2 {

	public static void main(String[] args) {

		BinaryTree<Integer> ab = arbolesEjemplo.arbol_Integers_A();
		
		//System.out.println(ab.contarHojas());
		
		//ab.printInorden();
		BinaryTree<Integer> abEspejo = ab.espejo();
		
		//System.out.println("===");
		//abEspejo.printInorden();
		
		//ab.printPorNiveles();
		System.out.println("===");
		ab.printEntreNiveles(3, 3);
	}

}
