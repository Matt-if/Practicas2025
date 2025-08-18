package objetos.dos.ej5Patrones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends Sugerencia{
	
	/* 1. filtrar peliculas ya vistas
	 * 2. Ordeno de mayor a menor puntaje
	 * 3. limito a las mejores 3
	 * 
	 * Nota: las películas de mayor puntaje, para igual puntaje considera las más recientes.
	 * Para cumplir con esta logica de orden se complica un poco la funcion del sorted()
	 */
	
	//Usando lambdas, como en el Apunte de Objetos
	public List<Pelicula> sugerir3pelis_Apunte(Decodificador deco) {
	    return this.obtenerPelisNoVistasDeLaGrilla(deco)
	    		.stream()
	    		.sorted((p1, p2) -> {
	                int cmp = p2.getPuntaje().compareTo(p1.getPuntaje()); // mayor puntaje primero
	                if (cmp == 0) {
	                    cmp = Integer.compare(p2.getAnioEstreno(), p1.getAnioEstreno()); // más reciente primero
	                }
	                return cmp;
	            })
	            .limit(3)
	            .collect(Collectors.toList());
	}

	//usando Method References
	public List<Pelicula> sugerir3pelis(Decodificador deco) {
	    return this.obtenerPelisNoVistasDeLaGrilla(deco).stream()
	            .sorted(
	                Comparator.comparing(Pelicula::getPuntaje).reversed()
	                          .thenComparing(Comparator.comparing(Pelicula::getAnioEstreno).reversed())
	            )
	            .limit(3)
	            .collect(Collectors.toList());
	}
}
