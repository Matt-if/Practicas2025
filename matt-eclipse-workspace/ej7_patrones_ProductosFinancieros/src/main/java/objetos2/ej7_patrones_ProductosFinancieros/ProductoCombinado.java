package objetos2.ej7_patrones_ProductosFinancieros;

import java.util.ArrayList;
import java.util.List;

public class ProductoCombinado implements ProductoFinanciero {

	private List<ProductoFinanciero> productos;
	
	public ProductoCombinado(List<ProductoFinanciero> productos) {
		this.productos = new ArrayList<ProductoFinanciero>();
		this.productos.addAll(productos);
	}

	public boolean agregarProductoFinanciero (ProductoFinanciero p) {
		return this.productos.add(p);
	}

	@Override
	public double retornoInversion(double monto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
