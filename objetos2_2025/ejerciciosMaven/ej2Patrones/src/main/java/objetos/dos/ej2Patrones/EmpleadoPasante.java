package objetos.dos.ej2Patrones;

public class EmpleadoPasante extends Empleado{
	private int examenesRendidos;

	public EmpleadoPasante(String nombre, int examentesRendidos) {
		super(nombre);
		this.examenesRendidos = examentesRendidos;
	}
	
	public double basico() {
		return 20000;
	}
	
    public double adicional() {
    	return examenesRendidos * 2000;
    }
}
