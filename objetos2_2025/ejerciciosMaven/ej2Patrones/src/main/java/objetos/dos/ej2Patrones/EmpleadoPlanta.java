package objetos.dos.ej2Patrones;

public class EmpleadoPlanta extends EmpleadoProfesional{
	private int aniosAntiguedad;

	public EmpleadoPlanta(String nombre, int cantHijos, boolean casado, int antiguedad) {
		super(nombre, cantHijos, casado);
		this.aniosAntiguedad = antiguedad;
	}
	
	public double basico() {
		return 50000;
	}
	
	protected double adicionalPorAntiguedad() {
		return 2000 * aniosAntiguedad;
	}
}
