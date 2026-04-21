package objetos2.ej7_patrones_ProductosFinancieros;

import java.util.ArrayList;
import java.util.List;

public abstract class Membresia {
	protected double tasaPlazoFijo;
	protected int plazoMinimoDeDiasPlazoFijo, parkingMinimoDeHorasDeBonos;
	
	
	// Este metodo dejaria de ser polimorfico si no se pueden recibir los montos por parametro.
	protected ProductoFinanciero crearProducto1(double montoPesos, double montoDolares, double montoPFDolares, int plazoPF ) {
		CompraDolares cd = new CompraDolares(montoPesos);
		CompraPesos cp = new CompraPesos(montoDolares);
		
		// Si los nros van directamente no estaria mal ? ` PlazoFijoEnDolares pfd = new PlazoFijoEnDolares(200, 35, 5); `
		PlazoFijoEnDolares pfd = null;
		if (plazoPF >= this.plazoMinimoDeDiasPlazoFijo) {
			pfd = new PlazoFijoEnDolares(montoPFDolares, this.plazoMinimoDeDiasPlazoFijo, this.tasaPlazoFijo);
		}
		
		return new ProductoCombinado(new ArrayList<ProductoFinanciero>(List.of(cd, pfd, cp)));
	}

	//Es hacer lo mismo que en el 1 con los productos financieros indicados
	protected ProductoFinanciero crearProducto2(double montoPesos, double montoDolares, double montoPFDolares, int plazoPF, double montoBono, int parking ) {
		ProductoFinanciero producto1 = this.crearProducto1(montoPesos, montoDolares, montoPFDolares, plazoPF);
		
		CompraBonoBajoRiesgo bono = null;
		if (parking >= this.parkingMinimoDeHorasDeBonos) {
			bono = new CompraBonoBajoRiesgo(montoBono, parking);
		}
		
		return new ProductoCombinado(new ArrayList<ProductoFinanciero>(List.of(bono, producto1)));
	}

}
