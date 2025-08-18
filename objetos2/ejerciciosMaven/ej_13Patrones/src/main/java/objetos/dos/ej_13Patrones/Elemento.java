package objetos.dos.ej_13Patrones;

public abstract class Elemento {
	String nombre;
	double precio;
	
	public Elemento(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

}
