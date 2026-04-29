package tp3;

import java.util.Iterator;

public class ej9_ParcialArboles {

	
	/*
	 * Cada nodo que entra en recursion, retorna el menor de sus hijos. 
	 * Al salir debe comparar su valor propio con ese y retornar true/false
	 * Esa condicion hay que mantenerla para cortar recursion.
	 * Puedo usar un recorrido Post-Orden ya que tengo que si o si recorrer todo el arbol para verificar.
	 * 
	 *  Cada nodo le pasa a su hijo su valor.
	 *  
	 *  "Si yo soy menor"
	 */
	
	
	private static boolean esDeSel (GeneralTree<Integer> ab) {
		int min = Integer.MAX_VALUE;
		boolean cumple = true, cumplenHijos = false;
		
		if (ab.isLeaf()) {
			cumple = true;
		}
		
		else {
			Iterator<GeneralTree<Integer>> it = ab.getChildren().iterator();
			
			while (cumple && it.hasNext()) {
				GeneralTree<Integer> child = it.next();
				if (child.getData() < min)
					min = child.getData();
				
				cumplenHijos = esDeSel(child);
			}
			cumple = cumplenHijos && ab.getData().equals(min);
		}
		
		return cumple;
	}

	
	public static boolean esDeSeleccion (GeneralTree<Integer> arbol) {
		
		return esDeSel(arbol);
	}
	
	
	public static void main(String[] args) {
		System.out.println(ej9_ParcialArboles.esDeSeleccion(aGeneralesEjemplo.aGeneralIntegers_1()));
	}

}
