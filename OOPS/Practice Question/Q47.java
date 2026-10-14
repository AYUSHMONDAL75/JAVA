// Q47: Circle with static constant PI
class Circle {
    static final double PI = 3.14159;
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return PI * radius * radius;
    }
}

public class Q47 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("PI = " + Circle.PI);
        System.out.println("Area = " + c.area());
    }
}
