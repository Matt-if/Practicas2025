package objetos2.ej16_patrones_Excursiones;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre, puntoEncuentro;
	private Date fIni, fFin;
	private double costo;
	private int cupoMin, cupoMax;
	private ExcursionState state;
	private List<User> inscriptos, espera;
	
	public Excursion(String nombre, String puntoEncuentro, Date fIni, Date fFin, double costo, int cupoMin,
			int cupoMax) {
		super();
		this.nombre = nombre;
		this.puntoEncuentro = puntoEncuentro;
		this.fIni = fIni;
		this.fFin = fFin;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		
		inscriptos = new ArrayList<User>();
		espera = new ArrayList<User>();
	}
	
	public void inscribirUsuario (User u) {
		state.handleInscripcion(this, u);
	}
	
	public String obtenerInfo () {
		return state.info(this);
	}

	public String getNombre() {
		return nombre;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public Date getfIni() {
		return fIni;
	}

	public Date getfFin() {
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

	public ExcursionState getState() {
		return state;
	}
	
	
	
	
	
}
