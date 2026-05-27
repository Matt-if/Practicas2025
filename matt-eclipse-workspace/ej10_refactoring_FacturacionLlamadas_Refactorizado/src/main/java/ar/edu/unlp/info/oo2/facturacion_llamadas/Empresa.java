package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo2.facturacion_llamadas.Clientes.Cliente;
import ar.edu.unlp.info.oo2.facturacion_llamadas.Clientes.ClienteFisico;
import ar.edu.unlp.info.oo2.facturacion_llamadas.Clientes.ClienteJuridico;
import ar.edu.unlp.info.oo2.facturacion_llamadas.GestorNumeros.GestorNumerosDisponibles;
import ar.edu.unlp.info.oo2.facturacion_llamadas.Llamadas.Llamada;
import ar.edu.unlp.info.oo2.facturacion_llamadas.Llamadas.LlamadaInternacional;
import ar.edu.unlp.info.oo2.facturacion_llamadas.Llamadas.LlamadaNacional;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	// Paso de tener Feature Envy a simplemente delegar
	public boolean agregarNumeroTelefono(String str) {
		return this.guia.agregarNumeroTelefono(str);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	public Cliente registrarUsuarioFisico(String dni, String nombre) {
		return new ClienteFisico(nombre, this.obtenerNumeroLibre(), dni);
	}
	
	public Cliente registrarUsuarioJuridico(String dni, String nombre) {
		return new ClienteJuridico(nombre, this.obtenerNumeroLibre(), dni);
	}

	public Llamada registrarLlamadaNacional(Cliente clienteOrigen, Cliente clienteDestino, int duracion) {
		Llamada llamada = new LlamadaNacional(clienteOrigen.getNumeroTelefono(), clienteDestino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		clienteOrigen.agregarLlamada(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamadaInternacional(Cliente clienteOrigen, Cliente clienteDestino, int duracion) {
		Llamada llamada = new LlamadaInternacional(clienteOrigen.getNumeroTelefono(), clienteDestino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		clienteOrigen.agregarLlamada(llamada);
		return llamada;
	}
	
	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
