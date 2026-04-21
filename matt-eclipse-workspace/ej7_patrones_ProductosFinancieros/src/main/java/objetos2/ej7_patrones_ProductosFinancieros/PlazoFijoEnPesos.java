package objetos2.ej7_patrones_ProductosFinancieros;

public class PlazoFijoEnPesos extends ProductoFinanciero {

	private int plazo;
	private double interes;
	
	public PlazoFijoEnPesos(double monto, int plazo, double interes) {
		this.monto = monto;
		this.plazo = plazo;
		this.interes = interes;
	}

	@Override
	public double retornoInversion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
