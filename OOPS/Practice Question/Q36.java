// Q36: Vehicle with different constructor combinations
class Vehicle {
    String brand = "Unknown", model = "Unknown";
    int year = 0;

    Vehicle(String brand) {
        this.brand = brand;
    }

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(brand + " | " + model + " | " + year);
    }
}

public class Q36 {
    public static void main(String[] args) {
        new Vehicle("Honda").display();
        new Vehicle("Honda", "City").display();
        new Vehicle("Honda", "City", 2022).display();
    }
}
