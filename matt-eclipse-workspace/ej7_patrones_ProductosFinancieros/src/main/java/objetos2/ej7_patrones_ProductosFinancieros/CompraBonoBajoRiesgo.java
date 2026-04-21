package objetos2.ej7_patrones_ProductosFinancieros;

import java.util.Random;

public class CompraBonoBajoRiesgo implements ProductoFinanciero {
	
	private double variacion;
	private int parking;
	
	public CompraBonoBajoRiesgo(int parking) {
		this.parking = parking;
		this.variacion = 10;
	}

	public double retornoInversion(double monto) {
			Random generador = new Random();
			return parking * monto * (generador.nextDouble(this.variacion) / 100 );
		}
}

