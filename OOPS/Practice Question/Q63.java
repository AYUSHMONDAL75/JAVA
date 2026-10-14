// Q63: Shape hierarchy in one class - overloaded area(), constructors, static counter
class Shape {
    static int shapeCount = 0;
    String type;
    double a, b;

    Shape(double radius) {                // circle
        type = "Circle";
        a = radius;
        shapeCount++;
    }

    Shape(double length, double width) {  // rectangle
        type = "Rectangle";
        a = length;
        b = width;
        shapeCount++;
    }

    Shape(double base, double height, boolean isTriangle) {   // triangle
        type = "Triangle";
        a = base;
        b = height;
        shapeCount++;
    }

    double area() {
        if (type.equals("Circle")) return area(a);
        if (type.equals("Rectangle")) return area(a, b);
        return area(a, b, true);
    }

    double area(double r) { return Math.PI * r * r; }
    double area(double l, double w) { return l * w; }
    double area(double base, double h, boolean tri) { return 0.5 * base * h; }
}

public class Q63 {
    public static void main(String[] args) {
        Shape s1 = new Shape(5);
        Shape s2 = new Shape(4, 6);
        Shape s3 = new Shape(3, 8, true);
        System.out.println(s1.type + " area = " + s1.area());
        System.out.println(s2.type + " area = " + s2.area());
        System.out.println(s3.type + " area = " + s3.area());
        System.out.println("Total shapes = " + Shape.shapeCount);
    }
}
