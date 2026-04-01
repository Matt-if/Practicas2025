package ar.edu.info.unlp.refactoring.ejercicio1;

public class HotelStay extends Product {
    public double cost; //antes
    private Hotel hotel;

    public HotelStay(double cost, TimePeriod timePeriod, Hotel hotel) {
        this.cost = cost;
        this.timePeriod = timePeriod;
        this.hotel = hotel;
    }

    public double price() {
        return this.timePeriod.duration() 
        		* this.hotel.getFinalPrice();
    }
    
    public double priceFactor() {
        return this.cost / this.price();
    }
}
