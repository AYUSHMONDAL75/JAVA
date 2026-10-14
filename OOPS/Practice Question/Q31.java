// Q31: Rectangle with overloaded constructors
class Rectangle {
    double length, width;

    Rectangle() {                       // unit square
        length = 1;
        width = 1;
    }

    Rectangle(double side) {            // square
        length = side;
        width = side;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Q31 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);
        System.out.println("Unit square area = " + r1.area());
        System.out.println("Square area = " + r2.area());
        System.out.println("Rectangle area = " + r3.area());
    }
}
