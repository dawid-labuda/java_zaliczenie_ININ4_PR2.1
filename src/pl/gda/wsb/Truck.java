package pl.gda.wsb;

public class Truck extends Vehicle implements Actions{
    protected double capacity;

    public Truck(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double tankCondition, double milage,double tankCapacity, double capacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, milage,tankCapacity);
        this.capacity = capacity;
    }
}
