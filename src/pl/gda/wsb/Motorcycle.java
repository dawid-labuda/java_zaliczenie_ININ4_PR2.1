package pl.gda.wsb;

public class Motorcycle extends Vehicle implements Actions{
    public Motorcycle(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double tankCondition, double milage,double tankCapacity) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, milage,tankCapacity);
    }
}
