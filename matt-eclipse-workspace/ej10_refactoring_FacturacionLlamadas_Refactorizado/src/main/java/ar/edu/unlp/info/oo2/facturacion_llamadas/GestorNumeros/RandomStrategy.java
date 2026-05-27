package ar.edu.unlp.info.oo2.facturacion_llamadas.GestorNumeros;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class RandomStrategy extends GeneradorNumerosStrategy {

	protected String lineaNecesaria (SortedSet<String> lineas) {
		return new ArrayList<String>(lineas).get(new Random().nextInt(lineas.size()));
	}
}
