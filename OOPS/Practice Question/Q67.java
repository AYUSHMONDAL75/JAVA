// Q67: Vehicle - constructor overloading, copy constructor, overloaded displayInfo(), static registry
class Vehicle {
    static int totalVehicles = 0;
    String brand, model;
    int year;

    Vehicle(String brand) {
        this(brand, "Unknown", 0);
    }

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        totalVehicles++;
    }

    Vehicle(Vehicle other) {
        this(other.brand, other.model, other.year);
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
    }

    void displayInfo(boolean full) {
        if (full) {
            System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        } else {
            displayInfo();
        }
    }
}

public class Q67 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Honda");
        Vehicle v2 = new Vehicle("Toyota", "Fortuner", 2023);
        Vehicle v3 = new Vehicle(v2);
        v1.displayInfo();
        v2.displayInfo(true);
        v3.displayInfo(true);
        System.out.println("Total vehicles manufactured = " + Vehicle.totalVehicles);
    }
}
