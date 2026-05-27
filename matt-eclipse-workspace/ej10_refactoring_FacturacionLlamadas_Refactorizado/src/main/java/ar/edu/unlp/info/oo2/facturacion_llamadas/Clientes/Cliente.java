package ar.edu.unlp.info.oo2.facturacion_llamadas.Clientes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo2.facturacion_llamadas.Llamadas.Llamada;

public abstract class Cliente {
	public List<Llamada> llamadas;
	private String nombre;
	private String numeroTelefono;
	
	public Cliente(String nombre, String numeroTelefono) {
		super();
		this.llamadas = new ArrayList<Llamada>();
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	
	public void agregarLlamada (Llamada llamada) {
		this.llamadas.add(llamada);
	}
	
	protected abstract double aplicarDescuentoCostoLlamada ();
	
	public double calcularMontoTotalLlamadas() {
		return llamadas.stream().
				mapToDouble(l -> l.calcularCostoDeLlamada())
				.sum() 
				* this.aplicarDescuentoCostoLlamada();
	}
}
