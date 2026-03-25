Link al cuadernillo: https://docs.google.com/document/d/1lUh8xz8foVFP4Y-gOHUkTNdBLmdag278sfaSR8iMooA/edit?tab=t.0

Ejercicio 1: Algo huele mal
Indique qué malos olores se presentan en los siguientes ejemplos.		

=============  1.1 Protocolo de Cliente  =============

La clase Cliente tiene el siguiente protocolo. ¿Cómo puede mejorarlo? 

``` java

/** 
* Retorna el límite de crédito del cliente
*/
public double lmtCrdt() {...

/** 
* Retorna el monto facturado al cliente desde la fecha f1 a la fecha f2
*/
protected double mtFcE(LocalDate f1, LocalDate f2) {...

/** 
* Retorna el monto cobrado al cliente desde la fecha f1 a la fecha f2
*/
private double mtCbE(LocalDate f1, LocalDate f2) {...

```

Tiene el problema de nombre misterioso y comentarios que explican el codigo porque no se entiende
Visibilidad de los metodos podria afectar ? creo necesito mas contexto.


```
public double limiteDeCredito() {...

protected double montoFacturadoEntre(LocalDate f1, LocalDate f2) {...

private double montoCobradoEntre(LocalDate f1, LocalDate f2) {...

```

============= 1.2 Participación en proyectos  =============

Al revisar el siguiente diseño inicial (Figura 1), se decidió realizar un cambio para evitar lo que se consideraba un mal olor. El diseño modificado se muestra en la Figura 2. 
Indique qué tipo de cambio se realizó y si lo considera apropiado. Justifique su respuesta.

La informacion obtenida es la misma, se cambia la responsabilidad del que la obtiene.
Antes persona checkeaba si participaba de un proyecto, provocando envidia de atts.
- Que te quede Persona como Data Class no es relevante.

============= 1.3 Cálculos =============
Analice el código que se muestra a continuación.
Indique qué code smells encuentra y cómo pueden corregirse.	

``` java
public void imprimirValores() {
	int totalEdades = 0;
	double promedioEdades = 0;
	double totalSalarios = 0;
	
	for (Empleado empleado : personal) {
		totalEdades = totalEdades + empleado.getEdad();
		totalSalarios = totalSalarios + empleado.getSalario();
	}
	promedioEdades = totalEdades / personal.size();
		
	String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	
	System.out.println(message);
}

```

Code Smells:
- Metodo largo (long method)
- Reinventa la rueda, usa for en vez de pipelines (stream).
- Nombre de metodo poco claro.
- Se usan variables temporales que no son necesarias (temporary field)
- Se mezcla logica de calculo con la presentacion de la informacion.

``` java
private double calcularPromedioEdades () {
	
	return personal.stream()
	.mapToInt(e -> e.getEdad())
	.average().orElse(0);
}

private double calcularTotalSalarios () {
	
	return personal.stream()
	.mapToDouble(e -> e.getSalario())
	.sum();
}

public String obtenerPromedioEdadYTotalSalarios() {
		
	return String.format("El promedio de las edades es %s y el total de salarios es %s", this.calcularPromedioEdades(), this.calcularTotalSalarios());
}

public void imprimir(String mensaje) {
	System.out.println(mensaje);
}

// Se usaria por ejemplo asi: 
// this.imprimir(this.obtenerPromedioEdadYTotalSalarios())

```