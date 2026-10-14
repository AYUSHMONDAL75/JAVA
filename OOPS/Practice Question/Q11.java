// Q11: Temperature conversion
class Temperature {
    double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}

public class Q11 {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        System.out.println("37 C = " + t.celsiusToFahrenheit(37) + " F");
        System.out.println("98.6 F = " + t.fahrenheitToCelsius(98.6) + " C");
    }
}
