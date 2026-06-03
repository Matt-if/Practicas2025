package tp5.ejercicio3;

import java.util.ArrayList;
import java.util.List;

import tp5.grafoEstructura.Edge;
import tp5.grafoEstructura.Graph;
import tp5.grafoEstructura.Vertex;

public class Mapa {
	
	private Graph<String> mapaCiudades;
	
	public Mapa(Graph<String> grafo) {
		super();
		this.mapaCiudades = grafo;
	}

	/* Cada Edge tiene: 
		- Combustible que es necesario para llegar al Target
	 	o (dependiendo del metodo)
		- Distancia al Target
		Supongo que dependiendo del metodo, el "getWeight" me retorna ese dato ? --> SI !
		Estamos trabajando con grafo no dirigido y conectado, entonces partiendo de un nodo se llega a cualquier otro eventualmente.
		La unica consideracion medio boluda seria que la ciudad destino no exista en el grafo...
	*/
	
	// ======================================= inciso a) ===========================================================================================
	// =============================================================================================================================================
	
	/* devolverCamino Retorna la lista de ciudades que se deben atravesar para ir de ciudad1 a ciudad2 en caso de que se pueda llegar, 
	 si no retorna la lista vacía. (Sin tener en cuenta el combustible). */
	
	// El backtracking de marca no es necesario porque la lista que voy armando es unica y ya se que me va a servir eventualmente, 
	// no hay que comparar multiples listas o inicios distintos.
	private boolean dfs_devolverCamino (int pos, boolean [] visitados, String ciudad2, List<String> res) {
		boolean encontrado = false;
		
		visitados[pos] = true;
		
		Vertex<String> v = this.mapaCiudades.getVertex(pos);
		
		List<Edge<String>> adyacentes = this.mapaCiudades.getEdges(v);
		
		res.add(v.getData()); // la primera vez se agrega la ciudad origen
		
		if (v.getData().equals(ciudad2)) {
			encontrado = true;
		}
		
		for (Edge<String> e: adyacentes) {
			int j = e.getTarget().getPosition();
			
			if (!visitados[j] && !encontrado) {
				encontrado = dfs_devolverCamino(j, visitados, ciudad2, res);
			}
		}
		
		if (!encontrado) {
			res.remove(res.size() - 1);
		}
		
		return encontrado;
		
	}

	public List<String> devolverCamino (String ciudad1, String ciudad2) {
		List<String> res = new ArrayList<String>();
		
		boolean [] visitados = new boolean [this.mapaCiudades.getSize()];
		
		int posCiudad1 = this.mapaCiudades.search(ciudad1).getPosition(); // en este caso puedo usar el search directamente.
		
		dfs_devolverCamino(posCiudad1, visitados, ciudad2, res);
		
		return res;
	}
	
	// ======================================= inciso b) ===========================================================================================
	// =============================================================================================================================================
	
	/* 
	 Retorna la lista de ciudades que forman un camino desde ciudad1 a ciudad2, 
	 sin pasar por las ciudades que están contenidas en la lista de ciudades pasada por parámetro, 
	 si no existe camino retorna la lista vacía. (Sin tener en cuenta el combustible).
	 */
	
	private boolean dfs_devolverCaminoExceptuando (int pos, boolean [] visitados, String ciudad2, List<String> res, List<String> cProhibidas) {
		boolean encontrado = false;
		
		visitados[pos] = true;
		
		Vertex<String> v = this.mapaCiudades.getVertex(pos);
		
		List<Edge<String>> adys = this.mapaCiudades.getEdges(v);
		
		String ciudadActual = v.getData();
		
		if (!cProhibidas.contains(ciudadActual)) {
			 
			res.add(ciudadActual);
			
			if (ciudadActual.equals(ciudad2)) {
				encontrado = true;
			}
			
			for (Edge<String> e: adys) {
				int j = e.getTarget().getPosition();
				if (!visitados[j] && !encontrado) {
					encontrado = dfs_devolverCaminoExceptuando(j, visitados, ciudad2, res, cProhibidas);
				}
			}
			
			if (!encontrado) {
				res.remove(res.size() - 1);
			}
		}
		
		return encontrado;
	}
	
	
	public List<String> devolverCaminoExceptuando (String ciudad1, String ciudad2, List<String> ciudades) {
		List<String> res = new ArrayList<String>();
		
		boolean [] visitados = new boolean [this.mapaCiudades.getSize()];
		
		int posCiudad1 = this.mapaCiudades.search(ciudad1).getPosition();
		
		dfs_devolverCaminoExceptuando(posCiudad1, visitados, ciudad2, res, ciudades);

		return res;
	}
	
	// ======================================= inciso c) ===========================================================================================
	// =============================================================================================================================================
	
	/* 
	 Retorna la lista de ciudades que forman el camino más corto para llegar de ciudad1 a ciudad2, 
	 si no existe camino retorna la lista vacía. (Las rutas poseen la distancia).
	 - En este caso el peso de las aristas es representado por la distancia.
	 - Forma de resolverlo distinta al estilo de inciso a y b. 
	 - Resuelto identico al ejemplo de la clase 12 de teoria (donde la profe muestra el metodo recursivo y usa objeto que guarda lRes y costoRes).
	 */
	private void dfs_caminoMasCorto (int pos, boolean [] visitados, String destino, List<String> lAct, int actualDist, MejorRes mejorResultado) {
		
		Vertex<String> v = this.mapaCiudades.getVertex(pos);
		
		List<Edge<String>> adys = this.mapaCiudades.getEdges(v);
		
		// la primera vez arrancamos con los adys de la ciudad origen.
		for (Edge<String> e : adys) {
			int j = e.getTarget().getPosition();
			
			if (!visitados[j]) {
				int d = e.getWeight();
				
				// Solo entramos si mejoramos la mejor distancia (la del ultimo camino encontrado)
				if ((actualDist + d) < mejorResultado.getMejorDistancia()) {
					Vertex<String> vDestino = e.getTarget(); 
					lAct.add(vDestino.getData()); 
					visitados[j] = true;
					if (vDestino.getData().equals(destino)) {
						// Llegué al destino y sé que es el mejor hasta ahora
						mejorResultado.setMejorDistancia(actualDist + d);
						mejorResultado.setMejorCamino(new ArrayList<String>(lAct));
					}
					else {
						// Todavía no llegué al destino, sigo explorando 
						dfs_caminoMasCorto(j, visitados, destino, lAct, actualDist + d, mejorResultado);
					}
					
					// BACKTRACKING: desmarcamos para explorar nuevas ramas 
					lAct.remove(lAct.size() - 1); 
					visitados[j] = false;
				}
			}
		}
	}
	
	public List<String> caminoMasCorto(String ciudad1, String ciudad2) {
		List<String> lAct = new ArrayList<String>();
		
		MejorRes mejorResultado = new MejorRes();
		
		boolean [] visitados = new boolean [this.mapaCiudades.getSize()];
		
		int posCiudad1 = this.mapaCiudades.search(ciudad1).getPosition();
		
		visitados[posCiudad1] = true;
		
		lAct.add(ciudad1);
		
		dfs_caminoMasCorto(posCiudad1, visitados, ciudad2, lAct, Integer.MAX_VALUE, mejorResultado);
		
		return mejorResultado.getMejorCamino();
	}
	
	// ======================================= inciso d) ===========================================================================================
	// =============================================================================================================================================
	
	
	/* 
	 Retorna la lista de ciudades que forman un camino para llegar de ciudad1 a ciudad2. 
	 El auto no debe quedarse sin combustible y no puede cargar. 
	 Si no existe camino retorna la lista vacía.
	 */
	public List<String> caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto) {
		List<String> res = new ArrayList<String>();
		
		return res;
	}
	
	// ======================================= inciso e) ===========================================================================================
	// =============================================================================================================================================
	
	/* 
	 Retorna la lista de ciudades que forman un camino para llegar de ciudad1 a ciudad2 teniendo en cuenta que el auto debe cargar la menor cantidad de veces. 
	 El auto no se debe quedar sin combustible en medio de una ruta, además puede completar su tanque al llegar a cualquier ciudad. 
	 Si no existe camino retorna la lista vacía.
	 */
	public List<String> caminoConMenorCargaDeCombustible (String ciudad1, String ciudad2, int tanqueAuto) {
		List<String> res = new ArrayList<String>();
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
