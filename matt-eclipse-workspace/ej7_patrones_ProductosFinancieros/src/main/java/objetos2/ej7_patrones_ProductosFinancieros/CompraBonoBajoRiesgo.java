package objetos2.ej7_patrones_ProductosFinancieros;

import java.util.Random;

public class CompraBonoBajoRiesgo extends ProductoFinanciero {
	
	private double variacion;
	private int parking;
	
	public CompraBonoBajoRiesgo(double monto, int parking) {
		this.monto = monto;
		this.parking = parking;
		this.variacion = 10;
	}

	// no se si esta bien esto jaja
	public double retornoInversion() {
		Random generador = new Random();
		return parking * monto * (generador.nextDouble(this.variacion) / 100 );
	}

}
