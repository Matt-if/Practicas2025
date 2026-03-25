package objetos.dos.ej5Patrones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad extends Sugerencia{
	
	/* 1. filtrar peliculas ya vistas
	 * 2. me quedo con las que tengan similitud con las que se vieron.
	 * 3. ordenar por fecha
	 * 4. limitar a los primeros 3 del pipeline
	 */
	public List<Pelicula> sugerir3pelis(Decodificador deco) {
		
	    return this.obtenerPelisNoVistasDeLaGrilla(deco).stream()
	            .filter(p -> p.soySimilarAAlgunaDe(deco.getPeliculasYaReproducidas()))
	            .sorted(Comparator.comparing(Pelicula::getAnioEstreno).reversed())
	            .limit(3)
	            .collect(Collectors.toList());
	}
}
