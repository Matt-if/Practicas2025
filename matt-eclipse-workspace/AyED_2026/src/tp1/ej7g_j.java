package tp1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ej7g_j {

	// g)
	private void calcular(int n, ArrayList<Integer> l) {
		l.add(n);
		
		if (n > 1) {
			if (n % 2 == 0)
				calcular(n/2, l);
			else
				calcular(3*n+1, l);
		}
	}
	
	public List<Integer> calcularSucesion (int n) { 
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		calcular(n, res);
		return res;		
	}
	
	// h)
	private void invertir (int i, List<Integer> lista) {
		int primero = lista.get(i);
		int ultimo = lista.get(lista.size()-i-1);
		
		lista.set(i, ultimo);
		lista.set(lista.size()-i-1, primero);

		if (i < lista.size() / 2) 
			invertir(i+1, lista);
	}
	
	public void invertirArrayList(ArrayList<Integer> lista) {	
		invertir(0, lista);
	}
	
	// i)
	private int sumar (int i, int suma, List<Integer> lista) {

		if (i < lista.size()) {
			return sumar(i + 1, suma + lista.get(i), lista);
		}
		else
			return suma;
	}
	
	public int sumarLinkedList(LinkedList<Integer> lista) {
		 
		return sumar(0, 0, lista);
	}
	
	// j) Implemente el método “combinarOrdenado” que reciba 2 listas de números ordenados 
	// y devuelva una nueva lista también ordenada conteniendo los elementos de las 2 listas.
	public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
		int i = 0, j = 0;
		
		ArrayList <Integer> res = new ArrayList<Integer>();
		
		while (i < lista1.size() || j < lista2.size()) {
			
			if(i == lista1.size()) {
				res.add(lista2.get(j));
				j++;
			} else if(j == lista2.size()) {
				res.add(lista1.get(i));
				i++;
			} else {
				if (lista1.get(i) < lista2.get(j)) {
					res.add(lista1.get(i));
					i++;
				}
				else {
					res.add(lista2.get(j));
					j++;
				}		
			}
		}

		/* Al haber usado los ifs para controlar los indices de cada lista, me ahorro de implementar
		estos for para terminar de recorrer.
		for (;i < lista1.size(); i++) {
			res.add(lista1.get(i));
		}
		
		for (;j < lista2.size(); j++) {
			res.add(lista2.get(j));
		}
		*/
		
		return res;
		
	}
	
	public static void main(String[] args) {
		// g) Considere que se aplica la siguiente función de forma recursiva. A partir de un número n positivo se obtiene una sucesión que termina en 1
		ej7g_j instancia = new ej7g_j();
		List<Integer> sucesion;
		sucesion = instancia.calcularSucesion(6);
		for (Integer i: sucesion) System.out.println(i);
		
		// h)
		ArrayList<Integer> l1 = new ArrayList<Integer>(List.of(1,2,3,4,5));
		instancia.invertirArrayList(l1);
		System.out.println(l1);
		
		// i) Implemente un método recursivo que calcule la suma de los elementos en un LinkedList.
		LinkedList<Integer> l2 = new LinkedList<Integer>(List.of(1,2,3,4,5));
		System.out.println(instancia.sumarLinkedList(l2));
		
		// j) Implemente el método “combinarOrdenado” que reciba 2 listas de números ordenados 
		// y devuelva una nueva lista también ordenada conteniendo los elementos de las 2 listas.
		ArrayList<Integer> l3 = new ArrayList<Integer>(List.of(1,2,3,4,5,90));
		ArrayList<Integer> l4 = new ArrayList<Integer>(List.of(11,12,13,14,15));
		ArrayList<Integer> ordenadas = instancia.combinarOrdenado(l3, l4);
		System.out.println(ordenadas);
		
	}

}
