package objetos2.ej16_patrones_Excursiones;

public abstract class ExcursionState {

	public String informacionCompletaPorEstado (Excursion ex) {
		return this.informacionEnComun(ex) + " " + this.infoParticularPorEstado(ex);
	}
	
	private String informacionEnComun (Excursion ex) {
		return ex.getNombre() + ex.getCosto() + ex.getfIni() + ex.getfFin() + ex.getPuntoEncuentro(); 
	}
	
	public abstract String infoParticularPorEstado (Excursion ex);
	
	public abstract ExcursionState handleInscripcion(Excursion ex, User u);
}
