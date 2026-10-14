// Q20: Calculator with overloaded add()
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Q20 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("add(2, 3) = " + c.add(2, 3));
        System.out.println("add(2, 3, 4) = " + c.add(2, 3, 4));
        System.out.println("add(2.5, 3.5) = " + c.add(2.5, 3.5));
    }
}
