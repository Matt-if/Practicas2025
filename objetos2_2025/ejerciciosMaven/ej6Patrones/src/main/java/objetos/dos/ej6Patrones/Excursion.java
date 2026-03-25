package objetos.dos.ej6Patrones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	private String nombre, puntoEncuentro;
	private LocalDate fInicio, fFin;
	private double costo;
	private int cupoMin, cupoMax;
	private List<Usuario> inscriptos;
	private List<Usuario> listaDeEspera;
	private EstadoExcursion estado;
	
	public Excursion(String nombre, String puntoEncuentro, LocalDate fInicio, LocalDate fFin, double costo, int cupoMin, int cupoMax) {
		super();
		this.nombre = nombre;
		this.puntoEncuentro = puntoEncuentro;
		this.fInicio = fInicio;
		this.fFin = fFin;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		
		inscriptos = new ArrayList<Usuario>();
		listaDeEspera = new ArrayList<Usuario>();
		estado = new EstadoProvisoria();
	}
	
	//metodo pedido tal cual
	public String obtenerInformacion () {
		return this.informacionBasica() + this.estado.informacionParticularDelEstado(this);
	}
	
	//nombre, costo, fechas y punto de encuentro se retornan siempre
	private String informacionBasica () {
		return this.getNombre() + ". Costo: " + this.getCosto() +  ". Inicio: " + this.getfInicio().toString() 
				+ ". Fin: "+ this.getfFin().toString() + ". Punto encuentro : " + this.getPuntoEncuentro() + ". ";
	}
	
	//metodo pedido tal cual
	public void inscribir (Usuario u) {
		this.estado.handleInscripcion(this, u);
	}
	
	public void addAInscriptos (Usuario u) {
		inscriptos.add(u);
	}
	
	public void addAEspera (Usuario u) {
		listaDeEspera.add(u);
	}
	
	//Si bien esto es algo que puede hacer Excursion, lo necesita usar solo el Estado Definitiva Cupo Incompleto.
	// Es correcto definirlo aca ?
	public String mailsInscriptos() {
		return this.inscriptos.stream()
					.map(u -> u.getEmail())
					.collect(Collectors.joining(", "));				
	}

	public String getNombre() {
		return nombre;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public LocalDate getfInicio() {
		return fInicio;
	}

	public LocalDate getfFin() {
		return fFin;
	}

	public int getCupoMin() {
		return cupoMin;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public int cantidadInscriptos() {
		return inscriptos.size();
	}
	
	public void setEstado(EstadoExcursion e) {
		this.estado = e;
	}
}
