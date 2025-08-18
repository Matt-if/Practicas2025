package objetos.dos.ej5Patrones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {

	private Decodificador deco;
	private Pelicula thor, capiAmerica, ironMan, dunkirk, rocky, rambo;
	private Sugerencia novs, simils, punts;
	private ArrayList<Pelicula> grilla;
	
	void crearPelis() {
		thor = new Pelicula("Thor", 7.9, 2007);
		rocky = new Pelicula("Rocky", 8.1, 1976);
		
		capiAmerica = new Pelicula("Capitan America", 7.8, 2016);
		ironMan = new Pelicula("Iron Man", 7.9, 2017);
		dunkirk = new Pelicula("Dunkirk", 7.9, 2017);	
		rambo = new Pelicula("Rambo", 7.8, 1979);
	}
	
	void crearSimilitudes () {
		thor.addPeliculaSimilar(capiAmerica); thor.addPeliculaSimilar(ironMan);
		
		capiAmerica.addPeliculaSimilar(ironMan);
		
		rocky.addPeliculaSimilar(rambo);
	}
	
	void agregarPelisAGrilla () {
		grilla.add(capiAmerica); grilla.add(dunkirk); 
		grilla.add(ironMan); grilla.add(rambo);
		grilla.add(rocky); grilla.add(thor);
	}
	
	@BeforeEach
	void setUp() throws Exception {
		grilla = new ArrayList<Pelicula>();
		this.crearPelis();
		this.crearSimilitudes();
		this.agregarPelisAGrilla();

		deco = new Decodificador(grilla, null);
		
		deco.verPelicula(thor);
		deco.verPelicula(rocky);
	}

	@Test
	void testSugerenciaPorSimilaridad() {
		simils = new Similaridad();
		deco.setSugerencia(simils);
		//System.out.println(deco.sugerir3Peliculas());
		assertEquals("Iron Man, Capitan America, Rambo", deco.sugerir3Peliculas());
	}
	
	@Test
	void testSugerenciaPorNovedad() {
		novs = new Novedad();
		deco.setSugerencia(novs);
		//System.out.println(deco.sugerir3Peliculas());
		assertEquals("Dunkirk, Iron Man, Capitan America", deco.sugerir3Peliculas());
	}
	
	@Test
	void testSugerenciaPorPuntaje() {
		punts = new Puntaje();
		deco.setSugerencia(punts);
		//System.out.println(deco.sugerir3Peliculas());
		assertEquals("Dunkirk, Iron Man, Capitan America", deco.sugerir3Peliculas());
	}

}
