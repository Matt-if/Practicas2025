package ar.edu.unlp.info.oo2.facturacion_llamadas.GestorNumeros;

import java.util.SortedSet;

public class UltimoStrategy extends GeneradorNumerosStrategy {

	protected String lineaNecesaria (SortedSet<String> lineas) {
		return lineas.last();
	}

}
