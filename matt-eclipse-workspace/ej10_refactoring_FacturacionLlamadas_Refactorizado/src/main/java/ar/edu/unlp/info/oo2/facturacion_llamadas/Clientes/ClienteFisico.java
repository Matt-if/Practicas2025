package ar.edu.unlp.info.oo2.facturacion_llamadas.Clientes;

public class ClienteFisico extends Cliente {
	private String dni;

	public ClienteFisico(String nombre, String numeroTelefono, String dni) {
		super(nombre, numeroTelefono);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	@Override
	protected double aplicarDescuentoCostoLlamada() {
		// TODO Auto-generated method stub
		return 1;
	}

}
