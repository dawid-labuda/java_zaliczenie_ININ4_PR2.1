package pl.gda.wsb;

public abstract class Vehicle implements Actions{
    protected String registrationNumber;
    protected String vinNumber;
    protected String color;
    protected double price;
    protected double fuelConsumption;
    protected double tankCondition;
    protected double milage;
    protected double tankCapacity;

    public Vehicle(String registrationNumber, String vinNumber, String color, double price, double fuelConsumption, double tankCondition, double milage, double tankCapacity) {
        this.registrationNumber = registrationNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.tankCondition = tankCondition;
        this.milage = milage;
        this.tankCapacity = tankCapacity;
    }

    public double range(){
        return (this.tankCondition/this.fuelConsumption)*100;
    }
    public void changeColor(String newColor){
        this.color = newColor;
        this.price = price+(price*0.05);
    }
    public void drive(){
        System.out.println("Drive");
    }
    public void drive(double kilometersToGo){
        if(kilometersToGo < this.range())
        {
            this.milage = this.milage + kilometersToGo;
            this.tankCondition = this.tankCondition - (this.fuelConsumption*(kilometersToGo/100));
        }
        else{
            System.out.println("Pojazd nie da rady przejechać tylu km bez tankowania");
        }
    }
    public void refuel(){
        System.out.println("Refuel");
    }
    public void refuel(double amountToFuel){
        if(this.tankCapacity>=(this.tankCondition+amountToFuel))
        {
            this.tankCondition+=amountToFuel;
        }
        else{
            this.tankCondition=this.tankCapacity;
            System.out.println("Zatankowano do pełna - więcej się nie dało");
        }
    }
}

