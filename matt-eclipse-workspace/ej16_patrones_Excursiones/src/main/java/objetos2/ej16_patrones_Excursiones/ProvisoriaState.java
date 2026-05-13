package objetos2.ej16_patrones_Excursiones;

public class ProvisoriaState extends ExcursionState {

	// Sin temrinar porque depende implementacion de las listas.
	
	@Override
	public void handleInscripcion(Excursion ex, User u) {
		// TODO Auto-generated method stub

	}
	
	private String faltantesParaCupoMinimo(Excursion ex) {
		return "";
	}
	
	public String info (Excursion ex) {
		return super.info(ex) + faltantesParaCupoMinimo(ex); 
	}

}
