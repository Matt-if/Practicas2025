package objetos2.ej16_patrones_Excursiones;

public class DefinitivaState extends ExcursionState {

	// Sin temrinar porque depende implementacion de las listas.
	
	@Override
	public void handleInscripcion(Excursion ex, User u) {
		// TODO Auto-generated method stub

	}
	
	private String mailsUsuariosInscriptos (Excursion ex) {
		return "";
	}
	
	public String info (Excursion ex) {
		return super.info(ex) + mailsUsuariosInscriptos(ex); 
	}

}
