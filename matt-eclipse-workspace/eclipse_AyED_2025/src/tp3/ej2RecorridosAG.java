package tp3;

import java.util.ArrayList;
import java.util.List;

import tp1.Queue;

public class ej2RecorridosAG {
	
	private static boolean esMayorAnEImpar ( GeneralTree <Integer> ab,	Integer n) {
		return (ab.getData() > n && ab.getData() % 2 == 1);
	}
	
	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	pasados como parámetros, recorrido en preorden. */
	private static void imparesPreOrden( GeneralTree <Integer> ab,	Integer n, List<Integer> res) {
		
		if (esMayorAnEImpar(ab, n)) res.add(ab.getData());
		
		for (GeneralTree<Integer> child : ab.getChildren()) {
			imparesPreOrden(child, n, res);
		}
	}
	
	public static List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a,	Integer n) {
		List<Integer> resultado = new ArrayList<Integer>();
		
		if (a != null && !a.isEmpty())
			imparesPreOrden(a, n, resultado);
		
		return resultado;
	}
	
	// ================================= ================================= =================================  
	
	private static void imparesInOrden( GeneralTree <Integer> ab, Integer n, List<Integer> res) {
		
		if (ab.hasChildren()) 
			imparesInOrden(ab.getChildren().get(0), n, res);
		
		if (esMayorAnEImpar(ab, n)) res.add(ab.getData());
		
		for (int i=1; i < ab.getChildren().size(); i++) {
					
			imparesInOrden(ab.getChildren().get(i), n, res);
		}
	}
	
	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	pasados como parámetros, recorrido en inorden. */
	public static List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a, Integer n) {
		List<Integer> resultado = new ArrayList<Integer>();
		
		if (a != null && !a.isEmpty())
			imparesInOrden(a, n, resultado);
		
		return resultado;
	}
	
	// ================================= ================================= =================================
	
	private static void imparesPostOrden( GeneralTree <Integer> ab,	Integer n, List<Integer> res) {
		
		for (GeneralTree<Integer> child : ab.getChildren()) {
			imparesPostOrden(child, n, res);
		}
		
		if (esMayorAnEImpar(ab, n)) res.add(ab.getData());
	}
	
	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	pasados como parámetros, recorrido en postorden. */
	public static List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a, Integer n) {
		List<Integer> resultado = new ArrayList<Integer>();
		
		if (a != null && !a.isEmpty())
			imparesPostOrden(a, n, resultado);
		
		return resultado;
	}
	
	// ================================= ================================= =================================  
	
	//Aca meter el null en la cola para separar por niveles no seria necesario
	private static void imparesPorNiveles( GeneralTree <Integer> ab, Integer n, List<Integer> res) {
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		
		GeneralTree<Integer> arbol_aux;
		cola.enqueue(ab);
		cola.enqueue(null);
		
		while (!cola.isEmpty()) {
			arbol_aux = cola.dequeue();
			
			if (arbol_aux != null) {
				if (esMayorAnEImpar(arbol_aux, n)) res.add(arbol_aux.getData());
				
				if (arbol_aux.hasChildren()) {
					for (GeneralTree<Integer> child: arbol_aux.getChildren()) {
						cola.enqueue(child);
					}
				}
			}
			else {
				if (!cola.isEmpty()) {
					cola.enqueue(null);
			
				}
			}
		}
	}
	
	/* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
	pasados como parámetros, recorrido por niveles. */
	public static List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a, Integer n) {
		List<Integer> resultado = new ArrayList<Integer>();
		
		if (a != null && !a.isEmpty())
			imparesPorNiveles(a, n, resultado);
		
		return resultado;
	}
	
	public static void main(String [] args) {
		GeneralTree<Integer> ab1 = aGeneralesEjemplo.aGeneralIntegers_1();
		GeneralTree<Integer> ab2 = aGeneralesEjemplo.aGeneralIntegers_2();
		int nro = 31;
		//ab1.preOrder();
		//ab1.postOrder();
		//ab1.inOrder();
		//ab2.porNiveles();
		
		//System.out.print("Pre Orden: "); System.out.println(numerosImparesMayoresQuePreOrden(ab2, nro));
		
		//System.out.print("Post Orden: "); System.out.println(numerosImparesMayoresQuePostOrden(ab2, nro));
		
		//System.out.print("In Orden: "); System.out.println(numerosImparesMayoresQueInOrden(ab2, nro));
		
		//System.out.print("Por niveles: ");  System.out.println(numerosImparesMayoresQuePorNiveles(ab2, nro));
		
		//System.out.print("Altura del arbol: "); System.out.println(ab1.altura());
		System.out.print("Altura del arbol: "); System.out.println(ab2.altura());
		System.out.print("Profundidad de " + nro + ": "); System.out.println(ab2.nivel(nro));
		System.out.print("Profundidad de 2: "); System.out.println(ab2.nivel(2));
		System.out.print("Profundidad de 99: "); System.out.println(ab2.nivel(99));
		
		System.out.print("Amplitud del arbol: "); System.out.println(ab2.ancho());
		
		System.out.print("Es 3 ancestro de 10 (si): "); System.out.println(ab2.esAncestro(3, 10));
		System.out.print("Es 3 ancestro de 3 (si): "); System.out.println(ab2.esAncestro(3, 3));
		System.out.print("Es 2 ancestro de 10 (no): "); System.out.println(ab2.esAncestro(2, 10));
		System.out.print("Es 0 ancestro de 32 (si): "); System.out.println(ab2.esAncestro(0, 32));
		

	}
}
