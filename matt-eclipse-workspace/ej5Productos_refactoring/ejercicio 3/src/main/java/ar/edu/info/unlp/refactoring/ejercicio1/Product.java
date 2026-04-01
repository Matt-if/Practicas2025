package ar.edu.info.unlp.refactoring.ejercicio1;

import java.time.LocalDate;

public class Product {
	protected TimePeriod timePeriod;
	
	//agregar constructor
	
	
    protected LocalDate startDate() {
        return this.timePeriod.start();
    }

    protected LocalDate endDate() {
        return this.timePeriod.end();
    }

}
