// Q6: Car class with drive(distance)
class Car {
    String brand, model;
    double fuel;               // litres
    double mileage = 10;       // km per litre

    Car(String brand, String model, double fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    void drive(double distance) {
        double needed = distance / mileage;
        if (needed <= fuel) {
            fuel -= needed;
            System.out.println("Drove " + distance + " km. Fuel left = " + fuel + " L");
        } else {
            System.out.println("Not enough fuel to drive " + distance + " km.");
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Innova", 20);
        c.drive(50);
        c.drive(100);
        c.drive(100);
    }
}
