package objetos2.ej16_patrones_Excursiones;

public class LlenaState extends ExcursionState {

	@Override
	public ExcursionState handleInscripcion(Excursion ex, User u) {
		ex.getEspera().add(u);
		return this;

	}

	public String infoParticularPorEstado(Excursion ex) {
		return "";
	}

}
