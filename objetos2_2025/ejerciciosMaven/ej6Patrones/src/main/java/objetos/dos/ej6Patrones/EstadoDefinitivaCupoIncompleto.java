package objetos.dos.ej6Patrones;

public class EstadoDefinitivaCupoIncompleto extends EstadoExcursion {

	public String informacionParticularDelEstado(Excursion ex) {
		
		return "Faltan " + (ex.getCupoMax() - ex.cantidadInscriptos()) + 
			   " para cupo maximo. Mails de usuarios inscriptos: " + ex.mailsInscriptos();
	}

	public void handleInscripcion(Excursion ex, Usuario u) {

		ex.addAInscriptos(u);
		
		if (ex.cantidadInscriptos() == ex.getCupoMax()) 
			ex.setEstado(new EstadoDefinitivaCupoCompleto());		
	}

}
