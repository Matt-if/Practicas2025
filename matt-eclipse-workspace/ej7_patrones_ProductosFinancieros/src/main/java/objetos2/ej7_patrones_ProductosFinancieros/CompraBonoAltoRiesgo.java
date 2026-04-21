package objetos2.ej7_patrones_ProductosFinancieros;

import java.util.Random;

public class CompraBonoAltoRiesgo extends ProductoFinanciero{

	private double variacion;
	private int parking;
	
	public CompraBonoAltoRiesgo(double monto, int parking) {
		this.monto = monto;
		this.parking = parking;
		this.variacion = 70;
	}

	public double retornoInversion() {
		Random generador = new Random();
		return parking * monto * (generador.nextDouble(this.variacion) / 100 );
	}

}
