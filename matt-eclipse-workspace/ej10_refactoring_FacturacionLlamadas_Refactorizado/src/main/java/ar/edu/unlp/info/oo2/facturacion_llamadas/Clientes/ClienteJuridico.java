package ar.edu.unlp.info.oo2.facturacion_llamadas.Clientes;

public class ClienteJuridico extends Cliente {
	private String cuit;

	public ClienteJuridico(String nombre, String numeroTelefono, String cuit) {
		super(nombre, numeroTelefono);
		this.cuit = cuit;
	}

	public String getCuit() {
		return cuit;
	}

	@Override
	protected double aplicarDescuentoCostoLlamada() {
		// TODO Auto-generated method stub
		return 0.85;
	}
}
