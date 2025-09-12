package pruebas;

import java.util.ArrayList;


public class prueba1 {

	public static boolean esCapicua (ArrayList<Integer> nros) {
		for (int i=0; i < nros.size() / 2 ; i++ ) {
			if (nros.get(i) != nros.get(nros.size()-1 - i) ) return false;
		}
		
		return true;
		
	}

		
	public static void main(String[] args) {

		ArrayList <Integer> l = new ArrayList<Integer>();
			
		l.add(1); l.add(2); l.add(2); l.add(1);
			
		System.out.println(esCapicua(l));
	}
		
		

	}
