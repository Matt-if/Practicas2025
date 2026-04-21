package objetos2.ej7_patrones_ProductosFinancieros;

public class CompraDolares extends ProductoFinanciero {

	private double valorCompra;
	
	public CompraDolares(double valorCompra) {
		super();
		this.valorCompra = valorCompra;
	}

	@Override
	public double retornoInversion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
