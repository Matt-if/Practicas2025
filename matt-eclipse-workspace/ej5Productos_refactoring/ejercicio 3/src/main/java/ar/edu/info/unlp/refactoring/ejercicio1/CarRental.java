package ar.edu.info.unlp.refactoring.ejercicio1;

public class CarRental extends Product {
    public double cost; //antes
    private Company company;

    public CarRental(double cost, TimePeriod timePeriod, Company company) {
        this.cost = cost;
        this.timePeriod = timePeriod;
        this.company = company;
    }

    //modificado por hacer move method a Company
    public double price() {
        return this.company.getFinalPrice();
    }

    public double cost() {
        return this.cost;
    }
    
}
