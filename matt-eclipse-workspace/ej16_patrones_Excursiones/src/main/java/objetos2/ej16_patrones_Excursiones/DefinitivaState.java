package objetos2.ej16_patrones_Excursiones;

public class DefinitivaState extends ExcursionState {

	// Sin temrinar porque depende implementacion de las listas.
	
	@Override
	public ExcursionState handleInscripcion(Excursion ex, User u) {
		ex.getInscriptos().add(u);
		
		if (ex.getInscriptos().size() == ex.getCupoMax())
			return new LlenaState();
		
		return this;
	}
	
	public String infoParticularPorEstado (Excursion ex) {
		return ex.mailsDeInscriptos() + String.valueOf(ex.faltantesParaCupoMax()); 
		
	}

}
