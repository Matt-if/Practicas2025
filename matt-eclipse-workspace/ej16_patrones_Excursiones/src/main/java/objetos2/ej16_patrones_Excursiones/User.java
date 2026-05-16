package objetos2.ej16_patrones_Excursiones;

public class User {

	private String nombre, ape, mail;

	public User(String nombre, String ape, String mail) {
		super();
		this.nombre = nombre;
		this.ape = ape;
		this.mail = mail;
	}
	
	public void inscribirme(Excursion ex) {
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getApe() {
		return ape;
	}

	public String getMail() {
		return mail;
	}
	
	
}
