package tp5.ejercicio2;

import java.util.ArrayList;
import java.util.List;

import tp1.ejercicio8.Queue;
import tp5.grafoEstructura.Edge;
import tp5.grafoEstructura.Graph;
import tp5.grafoEstructura.Vertex;
import tp5.instanciasDeGrafosEjemplo.GrafosDeEjemplo;

public class Recorridos {


	private <T> void dfs (int i, Graph<T> grafo, boolean[] marca, List<T> res) {
		marca[i] = true; 
		Vertex<T> v = grafo.getVertex(i);
		//System.out.println("El nodo que agrego a la lista res aqui es: " + v.getData());
		res.add(v.getData());
		
		List<Edge<T>> adyacentes = grafo.getEdges(v); //adyacentes del vertice v
		
		for (Edge<T> e: adyacentes){ 
			int j = e.getTarget().getPosition(); 
			if (!marca[j]) {
				dfs(j, grafo, marca, res); 
				}
			}
	}
	
	// Retorna una lista con los datos de los vértices,
	// con el recorrido en profundidad del grafo recibido.
	public <T> List<T> dfs(Graph<T> grafo) {
		
		boolean[] marca = new boolean[grafo.getSize()]; //por defecto pos. inicializan en false
		
		ArrayList<T> res = new ArrayList<T>();
		
		for (int i = 0; i < grafo.getSize(); i++) { 
			if (!marca[i]) { 
				System.out.println("En main dfs largo con: "+grafo.getVertex(i).getData()); 
				dfs(i, grafo, marca, res); 
			} 
		}
		
		return res;
	}
	
	private <T> void bfs(int i, Graph<T> grafo, boolean[] marca, List<T> res) {
		Queue<Vertex<T>> q = new Queue<Vertex<T>>(); 
		q.enqueue(grafo.getVertex(i)); 
		marca[i] = true;
		
		while (!q.isEmpty()) { 
			Vertex<T> w = q.dequeue(); 
			
			res.add(w.getData()); 
			
			// para todos los vecinos de w:
			List<Edge<T>> adyacentes = grafo.getEdges(w); 
			for (Edge<T> e: adyacentes) { 
				int j = e.getTarget().getPosition();
				if (!marca[j]) { 
					marca[j] = true; 	
					//Vertex<T> v = e.getTarget(); 
					q.enqueue(e.getTarget()); 
				} 
			}
		}
	}
	
	// Retorna una lista con los datos de vértices, con el recorrido en amplitud del grafo recibido como parámetro.
	public <T> List<T> bfs(Graph<T> grafo) {
		
		List<T> res = new ArrayList<T>();
		
		boolean[] marca =new boolean[grafo.getSize()];
		
		for (int i = 0; i < grafo.getSize(); i++) { 
			if (!marca[i]) { 
				this.bfs(i, grafo, marca, res); 
			} 
		}
		
		return res;
	}
	
	
	public static void main(String [] args) {
		
		Recorridos recorridos = new Recorridos();
		
		//imprimimos la lista que contiene los datos del grafo.
		// Por como se construyo este grafo, se inicia por el nodo que contiene el 1 porque fue el primero en agregarse.
		System.out.println("reco dfs: " + recorridos.dfs(GrafosDeEjemplo.grafo_Dirigido_B()));
		
		System.out.println("reco bfs: " +recorridos.bfs(GrafosDeEjemplo.grafo_Dirigido_B()));
		
		
		
	}
}
