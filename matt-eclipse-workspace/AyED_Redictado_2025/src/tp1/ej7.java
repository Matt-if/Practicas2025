package tp1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ej7 {
	
	public static boolean esCapicua (ArrayList<Integer> nros) {
		for (int i=0; i < nros.size() / 2 ; i++ ) {
			if (nros.get(i) != nros.get(nros.size()- 1 - i) ) return false;
		}
		return true;
	}
	
	
	private static void calcularSucesionRecursivo(int n, LinkedList<Integer> res) {
		res.add(n);
		
		if (n > 1) {
			if (n % 2 == 0) { calcularSucesionRecursivo(n/2, res); }
			else { calcularSucesionRecursivo(3*n + 1, res); }
		}
	}
	
	public static List<Integer> calcularSucesion (int n) {
		LinkedList<Integer> res = new LinkedList<Integer>();
		calcularSucesionRecursivo(n, res);		
		return res;
	}
	
	public static void invertirArrRecursivo(ArrayList<Integer> l, ArrayList<Integer> ln, int i) {
		
		if (i >= 0) {
			ln.add(l.get(i));
			invertirArrRecursivo(l, ln, i-1);
		}
	}
	
	public static void invertirArrayList(ArrayList<Integer> lista) {
		
		int i = lista.size() - 1;
		ArrayList<Integer> ln = new ArrayList<Integer>();
		invertirArrRecursivo(lista, ln, i);
		
		lista.clear(); lista.addAll(ln);

	}
	
	public static int sumarRecursivo(LinkedList<Integer> l, int i) {
		
		if (i == l.size()) return 0; //caso base
		
		return l.get(i) + sumarRecursivo(l, i+1);
		
	}
	
	public static int sumarLinkedList(LinkedList<Integer> lista) {
		int i = 0;
		return sumarRecursivo(lista, i);
	}
	
	public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> l1, ArrayList<Integer> l2) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		res.addAll(l1); res.addAll(l2);
		res.sort(null);
		
		return res;
	}
	
	public static void main(String[] args) {

		ArrayList <Integer> l = new ArrayList<Integer>();	
		l.add(1); l.add(2); l.add(3); // l.add(2); l.add(1);
		//System.out.println(esCapicua(l));
		
		//System.out.println(calcularSucesion(6));
		
		// invertirArrayList(l); System.out.println(l); //solucion piola sin usar otra lista, usando variables inicio en 0 y fin en size -1 para empezar recursion e ir cambiando
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1); ll.add(2); ll.add(3);
		// System.out.println(sumarLinkedList(ll));
		
		
		
		
	}
}
