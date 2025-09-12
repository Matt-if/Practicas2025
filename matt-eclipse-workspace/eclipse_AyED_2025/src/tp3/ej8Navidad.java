package tp3;

import java.util.Iterator;
import java.util.List;

public class ej8Navidad {
	
	GeneralTree <Integer> ab;
	
	public ej8Navidad(GeneralTree<Integer> ab) {
		super();
		this.ab = ab;
	}

	//Esto es incorrecto, preguntar por el valor de los hijos es estar recorriendo. 
	//Entonces estamos recorriendo dos veces
	private boolean recorrido_Version_Viejas (GeneralTree <Integer> a) {
		int cantHojas = 0;
		boolean soyAbeto = true;
		
		for (GeneralTree<Integer> child : a.getChildren()) {
			if (child.isLeaf()) cantHojas++;
		}
		
		if (cantHojas < 3) return false;
		
		Iterator<GeneralTree<Integer>> it = a.getChildren().iterator();
		while (soyAbeto && it.hasNext()) {
			GeneralTree<Integer> nodo = it.next(); //si no hago esto y comparo "!it.next().isLeaf()" avanzo en uno en la lista y me piedo un nodo!
			if (!nodo.isLeaf())
				soyAbeto = this.recorrido(nodo);
		}
		
		return soyAbeto;

	}

	private boolean recorrido (GeneralTree <Integer> a) {
		int cantHojas = 0;
		boolean esAbeto = true;
		
		if (a.isLeaf())
			return true;

		Iterator<GeneralTree<Integer>> it = a.getChildren().iterator();
		
		while (esAbeto && it.hasNext()) {
			GeneralTree<Integer> nodo = it.next();
			esAbeto = this.recorrido(nodo);
			if (esAbeto) cantHojas++;
			
		}
		
		if (cantHojas < 3) 
			return false;
		
		return esAbeto;

	}
	
	public String esAbetoNavidenio() {
		
		if (!this.ab.isEmpty() && !this.ab.isLeaf()) 
			if (this.recorrido(ab)) return "Si! es un abeto!";
		
		return "no hay abeto por aqui";
	}
	
	public static void main (String [] args) {
		
		ej8Navidad test = new ej8Navidad(aGeneralesEjemplo.aGeneralAbeto());
		
		System.out.println(test.esAbetoNavidenio());
		
		ej8Navidad test2 = new ej8Navidad(aGeneralesEjemplo.aGeneralIntegers_1());
		
		System.out.println(test2.esAbetoNavidenio());
	}
}
