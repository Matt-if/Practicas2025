package tp5.instanciasDeGrafosEjemplo;
import tp5.grafoEstructura.Graph;
import tp5.grafoEstructura.Vertex;
import tp5.grafoEstructura.listaAdy.AdjListGraph;

public class GrafosDeEjemplo {

	// Impreso en DFS se obtiene: [1, 5, 6, 8, 7, 2, 3, 4]
	// En BFS obtenemos lo mismo: [1, 5, 6, 8, 7, 2, 3, 4]
	public static Graph<Integer> grafo_Dirigido_A () {
		
		Graph<Integer> grafo = new AdjListGraph<Integer>();
		
		// 1. Creamos todos los vértices
        Vertex<Integer> v1 = grafo.createVertex(1);
        Vertex<Integer> v2 = grafo.createVertex(2);
        Vertex<Integer> v3 = grafo.createVertex(3);
        Vertex<Integer> v4 = grafo.createVertex(4);
        Vertex<Integer> v5 = grafo.createVertex(5);
        Vertex<Integer> v6 = grafo.createVertex(6);
        Vertex<Integer> v7 = grafo.createVertex(7);
        Vertex<Integer> v8 = grafo.createVertex(8);
        
        // 2. Establecemos las conexiones (Aristas dirigidas)
        // Ojo con el orden: connect(origen, destino)
        
        // Conexiones salientes desde 2
        grafo.connect(v2, v1);
        grafo.connect(v2, v3);
        grafo.connect(v2, v7);
        
        // Conexiones salientes desde 4
        grafo.connect(v4, v1);
        grafo.connect(v4, v3);
        grafo.connect(v4, v6);
        
        // Conexiones salientes desde 1
        grafo.connect(v1, v5);
        
        // Conexiones salientes desde 3
        grafo.connect(v3, v7);
        
        // Conexiones salientes desde 5
        grafo.connect(v5, v6);
        
        // Conexiones salientes desde 6
        grafo.connect(v6, v8);
        
        // Conexiones salientes desde 8
        grafo.connect(v8, v7);
        
        return grafo;
    }
	
	// En DFS: [1, 2, 5, 7, 4, 6, 3]
	// En BFS: [1, 2, 4, 3, 5, 6, 7]
	public static Graph<Integer> grafo_Dirigido_B() {
	        
	        Graph<Integer> grafo = new AdjListGraph<Integer>();
	        
	        // 1. Creamos todos los vértices (del 1 al 7)
	        Vertex<Integer> v1 = grafo.createVertex(1);
	        Vertex<Integer> v2 = grafo.createVertex(2);
	        Vertex<Integer> v3 = grafo.createVertex(3);
	        Vertex<Integer> v4 = grafo.createVertex(4);
	        Vertex<Integer> v5 = grafo.createVertex(5);
	        Vertex<Integer> v6 = grafo.createVertex(6);
	        Vertex<Integer> v7 = grafo.createVertex(7);
	        
	        // 2. Establecemos las conexiones (Aristas dirigidas)
	        
	        // Conexiones salientes desde 1
	        grafo.connect(v1, v2);
	        grafo.connect(v1, v4);
	        grafo.connect(v1, v3);
	        
	        // Conexiones salientes desde 2
	        grafo.connect(v2, v5);
	        
	        // Conexiones salientes desde 3
	        grafo.connect(v3, v5);
	        
	        // Conexiones salientes desde 4
	        grafo.connect(v4, v2);
	        grafo.connect(v4, v5);
	        grafo.connect(v4, v6);
	        grafo.connect(v4, v3);
	        
	        // Conexiones salientes desde 5
	        grafo.connect(v5, v7);
	        
	        // Conexiones salientes desde 6
	        grafo.connect(v6, v3);
	        grafo.connect(v6, v7);
	        
	        // El vértice 7 actúa como sumidero (no tiene conexiones salientes)
	        
	        return grafo;
	    }
	}
