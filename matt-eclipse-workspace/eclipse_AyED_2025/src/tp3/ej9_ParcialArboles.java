package tp3;

import java.util.Iterator;

public class ej9_ParcialArboles {

	//Incorrecto por lo mismo que el punto 8 de navidad
	private static boolean comprobarSiEsDeSeleccion_VersionVieja (GeneralTree<Integer> arbol) {
		boolean cumplo = true;
		int minimo = 9999999;
		
		if (arbol.isLeaf())
			return cumplo;
		
		for (GeneralTree<Integer> child : arbol.getChildren()) {
			if (child.getData() <= minimo) 
				minimo = child.getData();
		}
		
		if (arbol.getData() != minimo) 
			return false;
		
		Iterator<GeneralTree<Integer>> it = arbol.getChildren().iterator();
		
		while (cumplo && it.hasNext()) {
			GeneralTree<Integer> nodo = it.next();
			cumplo = comprobarSiEsDeSeleccion_VersionVieja(nodo);
		}

		return cumplo;
	
	}
	
	private static int comprobarSiEsDeSeleccion (GeneralTree<Integer> arbol) {
		int aux=0, minimo = 9999999;
		
		if (arbol.isLeaf())
			return arbol.getData();
		
		Iterator<GeneralTree<Integer>> it = arbol.getChildren().iterator();
		
		while (aux != -1 && it.hasNext()) {
			GeneralTree<Integer> nodo = it.next();
			aux = comprobarSiEsDeSeleccion(nodo); // si aux devuelve -1, debo dejar de recorrer
			if (aux < minimo)
				minimo = aux;
		}
		
		if (arbol.getData() != minimo)
			return -1;

		return minimo;
	
	}
	
	public static boolean esDeSeleccion (GeneralTree<Integer> arbol) {
		
		if (arbol != null && !arbol.isEmpty()) {
			
			if (comprobarSiEsDeSeleccion(arbol) != -1) 
				return true;
			
		}
		
		return false;
	}
	
	public static void main (String [] args) { 
		//aGeneralesEjemplo.aDeSeleccion().porNiveles();
		
		System.out.println(esDeSeleccion(aGeneralesEjemplo.aGeneralIntegers_1()));
		
		System.out.println(esDeSeleccion(aGeneralesEjemplo.aGeneralIntegers_2()));
		
		System.out.println(esDeSeleccion(aGeneralesEjemplo.aGeneralAbeto()));
		
		System.out.println(esDeSeleccion(aGeneralesEjemplo.aDeSeleccion())); //Este debe dar True
	}
}
