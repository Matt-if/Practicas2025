package objetos.dos.ej6Patrones;

public class EstadoDefinitivaCupoCompleto extends EstadoExcursion {

	public String informacionParticularDelEstado(Excursion ex) {
		return "";
	}

	@Override
	public void handleInscripcion(Excursion ex, Usuario u) {
		ex.addAEspera(u);
		
	}
}
