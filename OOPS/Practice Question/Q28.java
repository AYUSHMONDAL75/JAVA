// Q28: Shape with overloaded draw()
class Shape {
    void draw(double radius) {
        System.out.println("Drawing a circle with radius " + radius);
    }

    void draw(double length, double width) {
        System.out.println("Drawing a rectangle " + length + " x " + width);
    }

    void draw(double a, double b, double c) {
        System.out.println("Drawing a triangle with sides " + a + ", " + b + ", " + c);
    }
}

public class Q28 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw(5);
        s.draw(4, 6);
        s.draw(3, 4, 5);
    }
}
