package objetos.dos.ej2Patrones;

public abstract class Empleado {
	protected String nombre;
	
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}
	
    public double sueldo() {
    	return this.basico() 
    			+ this.adicional()
    			- this.descuento();
    }

    public double descuento() {
    	return this.basico() * 0.13 
    		   + this.adicional() * 0.05;
    }
    
    public  abstract double basico();
    public abstract double adicional();

	public String getNombre() {
		return nombre;
	}


}
