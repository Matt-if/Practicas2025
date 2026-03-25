package objetos.dos.ej5Patrones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Novedad extends Sugerencia{
	
	
	/* 1. filtrar peliculas ya vistas
	 * 2. ordenar por fecha
	 * 3. limitar a los primeros 3 del pipeline
	 */
	public List<Pelicula> sugerir3pelis(Decodificador deco) {
		
	    return this.obtenerPelisNoVistasDeLaGrilla(deco).stream()
	            .sorted(Comparator.comparing(Pelicula::getAnioEstreno).reversed()) //Orden descendente, mas nuevas a mas viejas
	            .limit(3)
	            .collect(Collectors.toList());
	}
	
	
	//Haciendolo como en el apunte tiene un detalle, por el tipo de dato primitivo.
	public List<Pelicula> sugerir3pelis_Apunte(Decodificador deco) {
		
	    return this.obtenerPelisNoVistasDeLaGrilla(deco).stream()
	            .sorted((p1, p2) -> p2.getAnioEstreno().compareTo(p1.getAnioEstreno())) //Si pelicula.getAnioEstreno() retorna un int primitivo, esto no anda. 
	            .limit(3)
	            .collect(Collectors.toList());
	}
}
