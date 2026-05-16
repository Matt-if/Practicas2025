package objetos2.ej16_patrones_Excursiones;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre, puntoEncuentro;
	private LocalDateTime fIni, fFin;
	private double costo;
	private int cupoMin, cupoMax;
	private ExcursionState state;
	private List<User> inscriptos, espera;
	
	public Excursion(String nombre, int cupoMin, int cupoMax, String puntoEncuentro, LocalDateTime fIni, LocalDateTime fFin, double costo) {
		super();
		this.nombre = nombre;
		this.puntoEncuentro = puntoEncuentro;
		this.fIni = fIni;
		this.fFin = fFin;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		
		state = new ProvisoriaState();
		inscriptos = new ArrayList<User>();
		espera = new ArrayList<User>();
	}
	
	public void inscribirUsuario (User u) {
		this.state = state.handleInscripcion(this, u);
	}
	
	public String obtenerInfo () {
		return state.informacionCompletaPorEstado(this);
	}
	
	public int faltantesParaMinimo() {
		return this.cupoMin - inscriptos.size();
	}
	
	public String mailsDeInscriptos () {
		return inscriptos.stream().map(u -> u.getMail()).toString();
	}
	
	public int faltantesParaCupoMax() {
		return cupoMax - inscriptos.size();
	}

	public String getNombre() {
		return nombre;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public LocalDateTime getfIni() {
		return fIni;
	}

	public LocalDateTime getfFin() {
		return fFin;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMin() {
		return cupoMin;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public List<User> getInscriptos() {
		return inscriptos;
	}

	public List<User> getEspera() {
		return espera;
	}
	
	
}
