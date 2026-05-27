package ar.edu.unlp.info.oo2.facturacion_llamadas.Llamadas;

public class LlamadaInternacional extends Llamada {

	public LlamadaInternacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected double costoBasicoLlamada() {
		return this.getDuracion() * 150;
	}
	@Override
	protected double adicional() {
		// TODO Auto-generated method stub
		return 50;
	}

}
