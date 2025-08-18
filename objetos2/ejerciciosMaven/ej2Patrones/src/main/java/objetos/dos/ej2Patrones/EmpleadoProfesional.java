package objetos.dos.ej2Patrones;

public abstract class EmpleadoProfesional extends Empleado{
	protected int cantHijos;
	protected boolean casado;
	
	public EmpleadoProfesional(String nombre, int cantHijos, boolean casado) {
		super(nombre);
		this.cantHijos = cantHijos;
		this.casado = casado;
	}
	
    protected abstract double adicionalPorAntiguedad();
    
    public double adicional() {
    	return this.adicionalPorHijos() 
    			+ this.adicionalPorCasado() 
    			+ this.adicionalPorAntiguedad();
    }
    
    private double adicionalPorHijos() {
    	return 2000 * this.cantHijos;
    }
    
    private double adicionalPorCasado() {
    	return (this.casado) ? 5000 : 0;
    }

    
    //Irian Setters al ser datos que pueden "cambiar en el tiempo" ?
    // para mi SI

}
