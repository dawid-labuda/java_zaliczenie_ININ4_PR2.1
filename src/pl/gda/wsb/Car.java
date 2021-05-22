package pl.gda.wsb;

public class Car extends Vehicle implements Actions{
    protected int numberOfDoors;

    public Car(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double tankCondition, double milage, double tankCapacity, int numberOfDoors) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, tankCondition, milage,tankCapacity);
        this.numberOfDoors = numberOfDoors;
    }
}
