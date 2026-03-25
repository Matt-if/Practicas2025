package objetos.dos.ej5Patrones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Decodificador {
	private List<Pelicula> grillaPeliculas;
	private Set<Pelicula> peliculasYaReproducidas; // puedo usar Set para evitar duplicados
	private Sugerencia sugerencia;
	
	public Decodificador(List<Pelicula> grillaPeliculas, Sugerencia sugerencia) {
		super();
		this.grillaPeliculas = grillaPeliculas;
		this.sugerencia = sugerencia;

		this.peliculasYaReproducidas = new HashSet<Pelicula>();
	}
	
	public void agregarAGrilla(Pelicula p) {
		this.grillaPeliculas.add(p);
	}
	
	public void verPelicula(Pelicula p) {
		this.peliculasYaReproducidas.add(p);
	}
	
	public void setSugerencia (Sugerencia s) {
		this.sugerencia = s;
	}
	
	public String sugerir3Peliculas () {
	
		return this.sugerencia.sugerir3pelis(this)
	               .stream()
	               .map(p -> p.getTitulo())
	               .collect(Collectors.joining(", "));
	}

	public List<Pelicula> getGrillaPeliculas() {
		return grillaPeliculas;
	}

	public void setGrillaPeliculas(List<Pelicula> grillaPeliculas) {
		this.grillaPeliculas = grillaPeliculas;
	}

	public Set<Pelicula> getPeliculasYaReproducidas() {
		return peliculasYaReproducidas;
	}

	public void setPeliculasYaReproducidas(Set<Pelicula> peliculasYaReproducidas) {
		this.peliculasYaReproducidas = peliculasYaReproducidas;
	}
}
