package tp3;

import java.util.Iterator;

public class ej8_Navidad {

	GeneralTree<Integer> arbol = aGeneralesEjemplo.aGeneralIntegers_1();
	
	/*
	 * Contexto: Llamaremos abeto a un árbol si cada vértice no hoja tiene al menos 3 hijos hojas. 
	 * Dado un árbol general, compruebe si es un abeto.
	 * 
	 * Nota: segun me respondieron en clase y videos de una profesora, p
	 * estando parado en un nodo, acceder al valor de un hijo para optimizar no es malo.
	 * 	Al contrario, incluso en casos como el de este ejercicio es algo necesario.
	 * 
	 * Logica para resolver:
	 * 
	 * En cada nodo controlo que si tiene hijos, al menos 3 sean hojas.
	 * - Si no tiene al menos 3, CORTO la recursion porque ya NO se cumple la CONDICION
	 * 
	 * No debo llamar a la recursion con un nodo hoja.
	 * 
	 * Para controlar la condicion puedo hacer que el metodo auxiliar retorne un Boolean.
	 * - Asi cuando entro en recursion retorno si la condicion fue cumplida o no.
	 * 		porque si ya se rompio la condicion, NO TENGO QUE SEGUIR RECORRIENDO.
	 */
	
	private boolean esAbeto(GeneralTree<Integer> ab) {
		
		boolean esGepeto = true;
		int hojas = 0;

		for (GeneralTree<Integer> child : ab.getChildren()) {
			if (child.isLeaf())
				hojas++;
		}
		
		if (hojas >= 3) {
			Iterator<GeneralTree<Integer>> it = ab.getChildren().iterator();
			while (esGepeto && it.hasNext()) {
				GeneralTree<Integer> child = it.next();
				if (!child.isLeaf())
					esGepeto = this.esAbeto(child);
			}
		}
		else {
			esGepeto = false;
		}
		
		return esGepeto;
	}
	
	
	public String esAbetoNavidenio() {
		
		if (this.arbol != null && !this.arbol.isEmpty())
			return this.esAbeto(this.arbol) ? "Si" : "No";
		return "Si";
	}
	
	public static void main (String [] args) {
		
		ej8_Navidad test = new ej8_Navidad();
		System.out.println(test.esAbetoNavidenio());
	}
}
