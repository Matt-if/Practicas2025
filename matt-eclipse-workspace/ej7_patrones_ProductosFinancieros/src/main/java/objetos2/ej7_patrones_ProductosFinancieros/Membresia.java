package objetos2.ej7_patrones_ProductosFinancieros;
import java.util.List;

public abstract class Membresia {
	protected double tasaPlazoFijo;
	protected int plazoMinimoDeDiasPlazoFijo, parkingMinimoDeHorasDeBonos;
	
	// ==== En la nueva solucion, esto va en Producto1 ====
	protected ProductoCombinado crearProducto1(double valorPeso, double valorDolar, int plazoPF ) {
		
		// para controloar la instanciacion es hacer esto o usar excepciones
		if (plazoPF >= this.plazoMinimoDeDiasPlazoFijo) {
			PlazoFijoEnDolares pfd = new PlazoFijoEnDolares(plazoPF, this.tasaPlazoFijo);
			CompraDolares cd = new CompraDolares(valorPeso);
			CompraPesos cp = new CompraPesos(valorDolar);
			return new ProductoCombinado(List.of(cd, pfd, cp));
		}
		else return null;

	}

	// ==== En la nueva solucion, esto va en Producto2 ====
	//Es hacer lo mismo que en el 1 + el bono.
	protected ProductoCombinado crearProducto2(double valorPeso, double valorDolar, int plazoPF, int parking ) {

		if (parking >= this.parkingMinimoDeHorasDeBonos) {
			ProductoFinanciero producto1 = this.crearProducto1(valorPeso, valorDolar, plazoPF);
			CompraBonoBajoRiesgo bono = new CompraBonoBajoRiesgo(parking);
			return new ProductoCombinado((List.of(bono, producto1)));
		}
		else return null;
		
	}

}
