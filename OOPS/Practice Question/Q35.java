// Q35: Circle - radius or diameter with boolean flag
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double value, boolean isDiameter) {
        if (isDiameter) {
            this.radius = value / 2;
        } else {
            this.radius = value;
        }
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Q35 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10, true);    // diameter 10 -> radius 5
        System.out.println("c1 radius = " + c1.radius + ", area = " + c1.area());
        System.out.println("c2 radius = " + c2.radius + ", area = " + c2.area());
    }
}
