package ar.edu.unlp.info.oo2.facturacion_llamadas.Llamadas;

public class LlamadaNacional extends Llamada {

	public LlamadaNacional(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
	}

	@Override
	protected double costoBasicoLlamada() {
		return this.getDuracion() * 3 ;
	}
	@Override
	protected double adicional() {
		// TODO Auto-generated method stub
		return 0;
	}

}
