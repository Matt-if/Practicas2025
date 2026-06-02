package tp5.ejercicio2;

import tp5.instanciasDeGrafosEjemplo.GrafosDeEjemplo;

public class TestRecorridos {

	public static void main(String[] args) {
		Recorridos recorridos = new Recorridos();
		
		//imprimimos la lista que contiene los datos del grafo.
		// Por como se construyo este grafo, se inicia por el nodo que contiene el 1 porque fue el primero en agregarse.
		System.out.println(recorridos.dfs(GrafosDeEjemplo.grafo_Dirigido_A()));

	}

}
