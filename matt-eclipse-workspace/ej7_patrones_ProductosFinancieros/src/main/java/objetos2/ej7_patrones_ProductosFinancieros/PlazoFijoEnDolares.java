package objetos2.ej7_patrones_ProductosFinancieros;

public class PlazoFijoEnDolares implements ProductoFinanciero {

	private int plazo;
	private double interes;
	
	public PlazoFijoEnDolares(int plazo, double interes) {
		this.plazo = plazo;
		this.interes = interes;
	}

	public double retornoInversion(double monto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
