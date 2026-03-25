package objetos.dos.ej7Patrones;

// DUDA: Veo problematico el tema de la Visibilidad de los setters, es realmente un problema ???

public class Calculadora {
	private double valorAcumulado;
	private Estado estado;

	public Calculadora() {
		this.valorAcumulado = 0;
		this.estado = new Inicial();
	}

	/* Devuelve el resultado actual de la operación realizada.
	* Si no se ha realizado ninguna operación, devuelve el valor acumulado.
	* Si la calculadora se encuentra en error, devuelve “error” */
    public String getResultado() {
    	return estado.handleResultado(this);
    }

    public double getValorAcumulado() {
		return this.valorAcumulado;
	}
    
    public void setValorAcumulado(double unValor) {
    	this.valorAcumulado = unValor;
    }
    
    public void setEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
	}

	/* Pone en cero el valor acumulado y reinicia la calculadora */
    public void borrar() {
    	this.valorAcumulado = 0;
    	this.estado = new Inicial();
    }
    
    /* Asigna un valor para operar. 
     * si hay una operación en curso, el valor será utilizado en la operación */
    public void setValor(double unValor) {
    	this.estado.handleSetValor(unValor, this);
    }
    
     /* Indica que la calculadora debe esperar un nuevo valor. 
    * Si a continuación se le envía el mensaje setValor(), la calculadora sumará el valor recibido como parámetro, al valor actual y guardará el resultado*/
    public void mas() {
    	this.estado.handleMas(this);
    }
  
	public void por() {
		this.estado.handlePor(this);
    }
    
    public void menos() {
    	this.estado.handleMenos(this);
    }
    
    public void dividido() {
    	this.estado.handleDividido(this);
    }
}
