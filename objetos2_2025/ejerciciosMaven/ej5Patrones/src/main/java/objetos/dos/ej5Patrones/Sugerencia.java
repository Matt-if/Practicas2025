package objetos.dos.ej5Patrones;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Sugerencia {

	protected List<Pelicula> obtenerPelisNoVistasDeLaGrilla(Decodificador deco) {
		return deco.getGrillaPeliculas().stream()
				.filter(p -> !deco.getPeliculasYaReproducidas().contains(p))
				.collect(Collectors.toList());
	}
	
	public abstract List<Pelicula> sugerir3pelis(Decodificador deco);
}
