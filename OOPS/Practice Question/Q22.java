// Q22: AreaCalculator with overloaded calculateArea()
class AreaCalculator {
    double calculateArea(double radius) {                 // circle
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {   // rectangle
        return length * width;
    }

    double calculateArea(double base, double height, boolean isTriangle) {  // triangle
        return 0.5 * base * height;
    }
}

public class Q22 {
    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();
        System.out.println("Circle area = " + a.calculateArea(5));
        System.out.println("Rectangle area = " + a.calculateArea(4, 6));
        System.out.println("Triangle area = " + a.calculateArea(4, 6, true));
    }
}
