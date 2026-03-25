package objetos.dos.ej6Patrones;

public abstract class EstadoExcursion {

	public abstract String informacionParticularDelEstado(Excursion ex);

	public abstract void handleInscripcion(Excursion ex, Usuario u);
}
