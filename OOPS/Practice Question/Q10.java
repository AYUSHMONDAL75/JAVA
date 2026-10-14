// Q10: Calculator with safe division
class Calculator {
    double add(double a, double b) { return a + b; }
    double subtract(double a, double b) { return a - b; }
    double multiply(double a, double b) { return a * b; }

    void divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed");
        } else {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add: " + c.add(10, 5));
        System.out.println("Subtract: " + c.subtract(10, 5));
        System.out.println("Multiply: " + c.multiply(10, 5));
        c.divide(10, 5);
        c.divide(10, 0);
    }
}
