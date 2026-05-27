package ar.edu.unlp.info.oo2.facturacion_llamadas.GestorNumeros;

import java.util.SortedSet;

public class PrimeroStrategy extends GeneradorNumerosStrategy {

	protected String lineaNecesaria (SortedSet<String> lineas) {
		return lineas.first();
	}
}
