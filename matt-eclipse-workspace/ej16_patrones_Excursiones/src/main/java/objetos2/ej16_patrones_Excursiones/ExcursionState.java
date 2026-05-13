package objetos2.ej16_patrones_Excursiones;

public abstract class ExcursionState {

	public String info (Excursion ex) {
		return ex.getNombre() + ex.getCosto() + ex.getfIni() + ex.getfFin() + ex.getPuntoEncuentro(); 
	}
	
	public abstract void handleInscripcion(Excursion ex, User u);
}
