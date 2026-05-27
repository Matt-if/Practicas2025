package ar.edu.unlp.info.oo2.facturacion_llamadas.GestorNumeros;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private GeneradorNumerosStrategy strategyGenerador;

	public GestorNumerosDisponibles() {
		this.strategyGenerador = new UltimoStrategy();
	}

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		return this.strategyGenerador.obtenerNumeroLibre(lineas);
	}

	public void cambiarTipoGenerador(GeneradorNumerosStrategy strat) {
		this.strategyGenerador = strat;
	}
	
	private boolean existeLinea(String str) {
		return this.lineas.contains(str);
	}
	
	//Ademas del move method desde Empresa, aqui se hizo Extract Method de la busqueda.
	public boolean agregarNumeroTelefono(String str) {
		if (!existeLinea(str)) {
			this.lineas.add(str);
			return true;
		}
		return false;
		
	}
}
