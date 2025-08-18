package objetos.dos.ej21_genealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero {
	private String Identificador;
	private String Especie;
	private LocalDate FechaNacimiento;
	
	private Mamifero Padre = new NullMamifero();
	private Mamifero Madre = new NullMamifero();
	
	public Mamifero () {	}
	
	public Mamifero (String nombre) {
		Identificador = nombre;
	}
	
	public String getIdentificador() {
		return Identificador;
	}
	
	public void setIdentificador(String identificador) {
		Identificador = identificador;
	}
	
	public String getEspecie() {
		return Especie;
	}
	
	public void setEspecie(String especie) {
		Especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getPadre() {
		return Padre;
	}
	
	public void setPadre(Mamifero padre) {
		Padre = padre;
	}
	
	public Mamifero getMadre() {
		return Madre;
	}
	
	public void setMadre(Mamifero madre) {
		Madre = madre;
	}
	
	public Mamifero getAbueloMaterno () {
		
		return Madre.getPadre(); //====> casos como este donde haria null check, se aprovecha NullObject
	}
	
	public Mamifero getAbueloPaterno() {
		
		return Padre.getPadre();
	}
	
	public Mamifero getAbuelaMaterna() {
		
		return Madre.getMadre();
	}
	
	public Mamifero getAbuelaPaterna() {
		
		return Padre.getMadre();
	}
	
	public Boolean tieneComoAncestroA (Mamifero unMamifero) {
		
		//Si no hago chequeo, cuando unMamifero == this se retorna True
		// y segun los tests tiene que ser False
		
		return (this == unMamifero) ? (false) : (buscar(this, unMamifero));

	}
	
	private Boolean buscar (Mamifero raiz, Mamifero unMamifero) {

		if (raiz == null) return false; 
		
		if (raiz.getIdentificador().equals((unMamifero).getIdentificador())) return true;
		
		return buscar(raiz.getPadre(), unMamifero) || buscar(raiz.getMadre(), unMamifero);

	}
	
	/* Explicacion de la ultima linea, el return magico con el OR.
	 * 
	 * "buscar(raiz.getPadre(), unMamifero)" 
	 * es como empezar a buscar recursivamente en el hijo izquierdo del nodo actual. 
	 * Si retorna False, porque se termino de recorrer toda esa rama, la ejecucion continua por 
	 *  con "buscar(raiz.getMadre(), unMamifero)" para ver si esta en ese sub arbol que falta recorrer.
	 * Si hubiese dado True la busqueda en el primer subarbol, se corta la ejecucion y se retorna True.
	 * 
	 * 
	 */
	
	
}
