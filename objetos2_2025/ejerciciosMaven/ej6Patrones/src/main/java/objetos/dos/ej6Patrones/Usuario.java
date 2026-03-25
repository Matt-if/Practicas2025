package objetos.dos.ej6Patrones;

public class Usuario {
	private String nombre, apellido, email;

	public Usuario(String nombre, String apellido, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public void inscribirmeEnExcursion(Excursion ex) {
		ex.inscribir(this);
	}

	public String getEmail() {
		return email;
	}
	
	
}
