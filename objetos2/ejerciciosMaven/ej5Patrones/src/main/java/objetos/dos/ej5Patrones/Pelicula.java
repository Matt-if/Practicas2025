package objetos.dos.ej5Patrones;

import java.util.HashSet;
import java.util.Set;

public class Pelicula {
	private String titulo;
	private int anioEstreno;
	private double puntaje;
	private Set<Pelicula> pelisSimilares;
	
	public Pelicula(String titulo, double puntaje, int anioEstreno) {
		super();
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.pelisSimilares = new HashSet<Pelicula>();
	}
	
	//Esto es correcto, evito la recursion y que se agregue la pelicula asi misma
	public void addPeliculaSimilar(Pelicula p) {
	    if (!pelisSimilares.contains(p) && this != p) {
	        pelisSimilares.add(p);
	        p.addPeliculaSimilar(this);
	    }
	}
	
	public boolean soySimilarA(Pelicula p) {
		return pelisSimilares.contains(p);
	}
	
	public boolean soySimilarAAlgunaDe(Set<Pelicula> pelis) {
		return pelis.stream()
				.anyMatch(p -> this.soySimilarA(p));
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAnioEstreno() {
		return anioEstreno;
	}

	public Double getPuntaje() {
		return puntaje;
	}

}
