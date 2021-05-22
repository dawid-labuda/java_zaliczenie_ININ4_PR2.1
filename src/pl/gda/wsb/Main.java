package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("GKA 9283","JNUE93874UH39","black",10000,6.5,70,200000,90,5);
        Car car2 = new Car("GD 9387","BFU839437483J","red",20999,9.5,90,150000,120,2);

        Truck truck1 = new Truck("GA 93283","VDH9393849348", "silver", 90000,35,1000,1200000,2000,4000);
        Truck truck2 = new Truck("GD 2938","WHDUW9839238","green",450000,26,1200,250000,1500,8000);

        Motorcycle motorcycle1 = new Motorcycle("GLE 30234","KD03943093", "black",14000,6,24,35000,40);
        Motorcycle motorcycle2 = new Motorcycle("CWE 9232","FJ93439J493","yellow",55000,3,35,5500,50);

        System.out.println(car1.registrationNumber);
        System.out.println(car2.registrationNumber);

        // Zad 6 - Metody jedź i tankuj
        car1.drive();
        car1.refuel();

        // Zad 7 - ile można przejechać km
        System.out.println("Pojazd o nr. rejestracyjnym "+car1.registrationNumber+" może jeszcze przejechać jeszcze: "+car1.range()+" km.");

        // Zad 8 - Modyfikacja 'jedź'
        System.out.println("Pojazd o nr. rejestracyjnym "+car1.registrationNumber+" ma przebieg: "+car1.milage+" km oraz "+car1.tankCondition+" l paliwa");
        car1.drive(100);
        System.out.println("Pojazd o nr. rejestracyjnym "+car1.registrationNumber+" ma przebieg: "+car1.milage+" km oraz "+car1.tankCondition+" l paliwa");

        // Zad 9 - Modyfikacja 'tankuj'
        System.out.println("Pojazd o nr. rejestracyjnym "+car1.registrationNumber+" ma jeszcze: "+car1.tankCondition+" l paliwa");
        car1.refuel(10);
        System.out.println("Pojazd o nr. rejestracyjnym "+car1.registrationNumber+" ma jeszcze: "+car1.tankCondition+" l paliwa");

        // Zad 10 Modyfikacja 'tankuj' - do pełna
        car1.refuel(140);
        System.out.println("Pojazd o nr. rejestracyjnym "+car1.registrationNumber+" ma jeszcze: "+car1.tankCondition+" l paliwa");

        // Zad 11 - zmiana koloru samochodu
        System.out.println("kolor: "+car1.color+" cena: "+car1.price);
        car1.changeColor("pink");
        System.out.println("kolor: "+car1.color+" cena: "+car1.price);
    }
}
