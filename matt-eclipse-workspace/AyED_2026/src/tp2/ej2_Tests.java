package tp2;

public class ej2_Tests {

	public static void main (String [] args) {
		BinaryTree<Integer> arbol = arbolesEjemplo.arbol_Integers_A();
		
		// System.out.println(arbol.contarHojas());
		
		BinaryTree<Integer> arbolEspejado = arbolesEjemplo.arbol_Integers_A().espejo();
		System.out.println("En orden arbol original");
		arbol.printInorden();
		System.out.println("En orden arbol espejo");
		arbolEspejado.printInorden();
	}
}
