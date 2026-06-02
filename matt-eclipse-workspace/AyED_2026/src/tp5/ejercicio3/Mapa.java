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
		(Por eso devolverCamino es facil y casi sin controles)
	*/
	
	// El backtracking no es necesario porque la lista que voy armando ya se que me va a servir, no hay ninguna condicion y el, si o si voy a encontrar el camino
	private void dfs_devolverCamino (int pos, boolean [] visitados, String ciudad2, List<String> res, boolean encontrado) {
		visitados[pos] = true;
		
		Vertex<String> v = this.mapaCiudades.getVertex(pos);
		
		List<Edge<String>> adyacentes = this.mapaCiudades.getEdges(v); 
		
		res.add(v.getData()); // la primera vez se agrega la ciudad origen
		
		for (Edge<String> e: adyacentes) {
			int j = e.getTarget().getPosition();
			
			if (!visitados[j]) {
				
				Vertex<String> ciudadActual = e.getTarget();
				
				if (ciudadActual.getData() != ciudad2) {
					dfs_devolverCamino(j, visitados, ciudad2, res, encontrado);
					// res.remove(res.size()-1); 
				}
				
				else encontrado = true;
				
				}
		}
		
	}

	/* Retorna la lista de ciudades que se deben atravesar para ir de ciudad1 a ciudad2 en caso de que se pueda llegar, 
	 si no retorna la lista vacía. (Sin tener en cuenta el combustible). */
	public List<String> devolverCamino (String ciudad1, String ciudad2) {
		List<String> res = new ArrayList<String>();
		
		boolean [] visitados = new boolean [this.mapaCiudades.getSize()];
		
		int posCiudad1 = this.mapaCiudades.search(ciudad1).getPosition(); // puedo usar el search no ? Si.
		
		dfs_devolverCamino(posCiudad1, visitados, ciudad2, res, false);
		
		return res;
		
	}
	
	
	/* 
	 Retorna la lista de ciudades que forman un camino desde ciudad1 a ciudad2, sin pasar por las ciudades que están contenidas en la lista ciudades pasada por parámetro, 
	 si no existe camino retorna la lista vacía. (Sin tener en cuenta el combustible)
	 */
	public List<String> devolverCaminoExceptuando (String ciudad1, String ciudad2, List<String> ciudades) {
		List<String> res = new ArrayList<String>();
		
		return res;
	}
	
	/* 
	 Retorna la lista de ciudades que forman el camino más corto para llegar de ciudad1 a ciudad2, 
	 si no existe camino retorna la lista vacía. (Las rutas poseen la distancia).
	 */
	public List<String> caminoMasCorto(String ciudad1, String ciudad2) {
		List<String> res = new ArrayList<String>();
		
		return res;
	}
	
	
	/* 
	 Retorna la lista de ciudades que forman un camino para llegar de ciudad1 a ciudad2. 
	 El auto no debe quedarse sin combustible y no puede cargar. Si no existe camino retorna la lista vacía.
	 */
	public List<String> caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanqueAuto) {
		List<String> res = new ArrayList<String>();
		
		return res;
	}
	
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
