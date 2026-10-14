// Q2: Rectangle class - area, perimeter and largest area
class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Rectangle[] r = { new Rectangle(4, 5), new Rectangle(10, 2), new Rectangle(7, 6) };
        Rectangle largest = r[0];
        for (int i = 0; i < r.length; i++) {
            System.out.println("Rectangle " + (i + 1) + ": Area = " + r[i].area() + ", Perimeter = " + r[i].perimeter());
            if (r[i].area() > largest.area()) {
                largest = r[i];
            }
        }
        System.out.println("Largest area = " + largest.area() + " (" + largest.length + " x " + largest.width + ")");
    }
}
