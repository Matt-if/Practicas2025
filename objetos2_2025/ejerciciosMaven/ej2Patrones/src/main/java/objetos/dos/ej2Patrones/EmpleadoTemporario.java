package objetos.dos.ej2Patrones;

public class EmpleadoTemporario extends EmpleadoProfesional{
	private int hsTrabajadas;

	public EmpleadoTemporario(String nombre, int cantHijos, boolean casado, int hsTrabajadas) {
		super(nombre, cantHijos, casado);
		this.hsTrabajadas = hsTrabajadas;
	}
	
	private double remuneracionPorHSTrabajadas() {
		return 300 * this.hsTrabajadas;
	}
	
	public double basico() {
		return 20000 + remuneracionPorHSTrabajadas();
	}
	
	protected double adicionalPorAntiguedad() {
		return 0;
	}
}
