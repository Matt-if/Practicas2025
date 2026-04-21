package objetos2.ej7_patrones_ProductosFinancieros;

import java.util.List;

public class Producto1 implements ProductoFactory {

	// Cual es la forma correcta de que recib los parametros ?
	protected ProductoCombinado crearProducto() {
		
		// para controloar la instanciacion es hacer esto o usar excepciones
		if (plazoPF >= this.plazoMinimoDeDiasPlazoFijo) {
			PlazoFijoEnDolares pfd = new PlazoFijoEnDolares(plazoPF, this.tasaPlazoFijo);
			CompraDolares cd = new CompraDolares(valorPeso);
			CompraPesos cp = new CompraPesos(valorDolar);
			return new ProductoCombinado(List.of(cd, pfd, cp));
		}
		else return null;

	}

}
