package objetos2.ej7_patrones_ProductosFinancieros;

public class PlazoFijoEnDolares extends ProductoFinanciero {

	private int plazo;
	private double interes;
	
	public PlazoFijoEnDolares(double monto, int plazo, double interes) {
		this.monto = monto;
		this.plazo = plazo;
		this.interes = interes;
	}

	public PlazoFijoEnDolares() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double retornoInversion() {
		return monto * plazo * (interes/100);
	}

}
