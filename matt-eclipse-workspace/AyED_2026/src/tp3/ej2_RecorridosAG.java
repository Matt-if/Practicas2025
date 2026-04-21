package tp3;

import java.util.ArrayList;
import java.util.List;

import tp1.ejercicio8.Queue;

public class ej2_RecorridosAG {
	
	private boolean dataEsImparYMayor (int data, int n) {
		
		return (!(data % 2 == 0) && data > n) ? true : false; 
	}
	
	private void recorridoPre (GeneralTree <Integer> a, List<Integer> lista, Integer n) {
		if (this.dataEsImparYMayor(a.getData(), n)) {
			lista.add(a.getData());
		}
		
		List <GeneralTree<Integer>> children = a.getChildren();
		
		// si children == null, for tira excep ?
		for (GeneralTree<Integer> child: children) {
			this.recorridoPre(child, lista, n);
		}
	}
	
	// Retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n” pasados como parámetros, recorrido en preorden.
	public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree <Integer> a, Integer n) {
		
		List<Integer> listaRes = new ArrayList<Integer>();
		
		if (a != null && !a.isEmpty())
			recorridoPre(a, listaRes, n);
		
		return listaRes;
		
	}
	
	//Este recorrido no tiene mucho sentido
	private void recorridoIn (GeneralTree <Integer> a, List<Integer> lista, Integer n) {

		
		if (a.hasChildren()) {
			this.recorridoIn(a.getChildren().get(0), lista, n);
		}
		
		if (this.dataEsImparYMayor(a.getData(), n)) {
			lista.add(a.getData());
		}
		
		for (int i=1; i < a.getChildren().size(); i++) {
			this.recorridoIn(a.getChildren().get(i), lista, n);
		}

	}
	// retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n” pasados como parámetros, recorrido en inorden.
	public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a, Integer n) {
		List<Integer> listaRes = new ArrayList<Integer>();
		
		if (a != null && !a.isEmpty())
			recorridoIn(a, listaRes, n);
		
		return listaRes;
		
	}
	
	private void recorridoPost (GeneralTree <Integer> a, List<Integer> lista, Integer n) {
		
		List <GeneralTree<Integer>> children = a.getChildren();
		
		for (GeneralTree<Integer> child: children) {
			this.recorridoPost(child, lista, n);
		}
		
		if (this.dataEsImparYMayor(a.getData(), n)) {
			lista.add(a.getData());
		}
	}
	
	// Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n” pasados como parámetros, recorrido en postorden.
	public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a, Integer n) {
		List<Integer> listaRes = new ArrayList<Integer>();
		
		if (a != null && !a.isEmpty())
			recorridoPost(a, listaRes, n);
		
		return listaRes;
		
	}
	
	// Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n” pasados como parámetros, recorrido por niveles.
	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a, Integer n) {
		List<Integer> listaRes = new ArrayList<Integer>();
		
		GeneralTree<Integer> nodo;
		
		Queue<GeneralTree<Integer>> cola = new Queue<GeneralTree<Integer>>();
		
		cola.enqueue(a);
		cola.enqueue(null);
		
		while (!cola.isEmpty()) {
			nodo = cola.dequeue();
			
			if (nodo != null) {
				if (this.dataEsImparYMayor(nodo.getData(), n)) {
					listaRes.add(nodo.getData());
				}
				
				if (nodo.hasChildren()) {
					for (GeneralTree<Integer> child: nodo.getChildren()) {
						cola.enqueue(child);
					}
				}
			}
			else {
				//hubo cambio de nivel. En este caso no nos cambia nada.
				if (!cola.isEmpty()) {
					cola.enqueue(null);
				}
			}
		}

		return listaRes;
		
	}
	
	/* b) Si ahora tuviera que implementar estos métodos en la clase GeneralTree<T>, ¿qué modificaciones haría tanto en la firma como en la implementación de los mismos?
	
	* Para el metodo de entrada no tendria que pasar un arbol por parametro, seria autoreferenciar la v.i donde esta el arbol dentro del metodo.
	* Los metodos auxiliares privados seguirian igual porque necesito el arbol como parametro para avanzar recursivamente.
	*/
	public static void main(String[] args) {
		GeneralTree<Integer> a = aGeneralesEjemplo.aGeneralIntegers_1();
		ej2_RecorridosAG test = new ej2_RecorridosAG();
		
		List<Integer> lista_res;
		lista_res = test.numerosImparesMayoresQuePreOrden(a, 2);
		System.out.println(lista_res); //retornar  21  23 3 31;
		
		lista_res = test.numerosImparesMayoresQueInOrden(a, 2);
		System.out.println(lista_res);

	}

}
