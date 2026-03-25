package tp1;

import java.util.Objects;

public class Estudiante {

	String nombre, apellido, comision, email, direccion;

	
	public Estudiante(String nombre, String apellido, String comision, String email, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.comision = comision;
		this.email = email;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", comision=" + comision + ", email=" + email
				+ ", direccion=" + direccion + "]";
	}
	
	//Con el tema del equals y hashcode es overkill para Ayed en general pero fue para aprender.
	@Override
	public boolean equals(Object obj) {
	    // 1. Optimización: ¿Son exactamente la misma referencia en memoria?
	    if (this == obj) {
	        return true;
	    }
	    
	    // 2. Seguridad: ¿El objeto es nulo o es de una clase diferente?
	    // (Si comparas un Estudiante con un String, o con null, es falso)
	    if (obj == null || this.getClass() != obj.getClass()) {
	        return false;
	    }
	    
	    // 3. Casteo: Ya sabemos que es un Estudiante, lo transformamos
	    Estudiante otroEstudiante = (Estudiante) obj;
	    
	    // 4. Comparación de atributos (el estado) que definen la identidad.
	    // Usamos Objects.equals() que es seguro contra valores null
	    return Objects.equals(this.nombre, otroEstudiante.nombre) &&
	           Objects.equals(this.apellido, otroEstudiante.apellido);
	}
	
	/* Si sobrescribes equals(), DEBES sobrescribir hashCode(). El hashCode() es una función que toma los datos de tu objeto 
	 * 	y genera un número entero (un hash). Colecciones muy usadas en Java, como HashSet o HashMap, usan este número para organizar y 
	 * 	encontrar objetos a la velocidad de la luz, metiéndolos en "cajas" (buckets) numeradas.
	 * El contrato dice: Si dos objetos son iguales según equals(), tienen que devolver el mismo número de hashCode().
	 * 	Si no lo hacen, Java los guardará en cajas equivocadas y nunca los volverá a encontrar cuando los busques en la colección.
	 */
	@Override
    public int hashCode() {
        // Tienen que ser los mismos campos usados en equals()
        return Objects.hash(nombre, apellido);
    }
}
	
