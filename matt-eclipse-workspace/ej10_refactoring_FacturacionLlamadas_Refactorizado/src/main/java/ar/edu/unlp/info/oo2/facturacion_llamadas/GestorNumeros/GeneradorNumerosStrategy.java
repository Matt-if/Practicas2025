package ar.edu.unlp.info.oo2.facturacion_llamadas.GestorNumeros;

import java.util.SortedSet;

public abstract class GeneradorNumerosStrategy {
	
	protected abstract String lineaNecesaria (SortedSet<String> lineas);
	
	public String obtenerNumeroLibre(SortedSet<String> lineas) {
		String linea = this.lineaNecesaria(lineas);
		lineas.remove(linea);
		return linea;
	}

}
