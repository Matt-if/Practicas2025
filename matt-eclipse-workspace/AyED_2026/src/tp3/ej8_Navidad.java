package tp3;

public class ej8_Navidad {

	GeneralTree<Integer> arbol;
	
	/*
	 * Contexto: Llamaremos abeto a un árbol si cada vértice no hoja tiene al menos 3 hijos hojas. 
	 * Dado un árbol general, compruebe si es un abeto.
	 * 
	 * Nota: estando arado en un nodo, acceder al valor de un hijo para mejorar el codigo no es malo.
	 * 	Al contrario, en casos como el de este ejercicio es algo necesario.
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
	 * 		porque si ya se rompio la condicino NO TENGO QUE SEGUIR RECORRIENDO.
	 */
	
	public String esAbetoNavidenio() {
		
		return "";
	}
}
