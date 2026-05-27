package ar.edu.unlp.info.oo2.facturacion_llamadas.Llamadas;

public abstract class Llamada {
	private String origen;
	private String destino;
	private int duracion;

	public Llamada(String origen, String destino, int duracion) {
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}
	
	protected abstract double costoBasicoLlamada ();
	protected abstract double adicional();
	
	private double costoIVA() {
		return this.costoBasicoLlamada() * 0.21;
	}
	
	public double calcularCostoDeLlamada () {
		return this.costoBasicoLlamada() +
				this.costoIVA() +
				this.adicional();
	}

	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}
}
