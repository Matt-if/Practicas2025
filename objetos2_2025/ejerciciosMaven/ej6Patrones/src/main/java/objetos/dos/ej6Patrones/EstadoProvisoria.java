package objetos.dos.ej6Patrones;

public class EstadoProvisoria extends EstadoExcursion {

	public String informacionParticularDelEstado(Excursion ex) {
		
		int faltantes = ex.getCupoMin() - ex.cantidadInscriptos();
		
		return "Faltan " + faltantes + " para cupo minimo";
	}

	public void handleInscripcion(Excursion ex, Usuario u) {
		ex.addAInscriptos(u);
		
		if (ex.cantidadInscriptos() == ex.getCupoMin()) 
			ex.setEstado(new EstadoDefinitivaCupoIncompleto());
	}

}
