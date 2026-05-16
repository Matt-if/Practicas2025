package objetos2.ej16_patrones_Excursiones;

public class ProvisoriaState extends ExcursionState {

	// Sin temrinar porque depende implementacion de las listas.
	
	@Override
	public ExcursionState handleInscripcion(Excursion ex, User u) {
		ex.getInscriptos().add(u);
		
		if (ex.getInscriptos().size() == ex.getCupoMin())
			return new DefinitivaState();
		
		return this;
	}
	
	public String infoParticularPorEstado (Excursion ex) {
		return String.valueOf(ex.faltantesParaMinimo()); 
	}

}
