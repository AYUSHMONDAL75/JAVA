// Q51: Rectangle copy constructor - copy is independent
class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    Rectangle(Rectangle other) {
        this.length = other.length;
        this.width = other.width;
    }

    void display(String label) {
        System.out.println(label + ": " + length + " x " + width);
    }
}

public class Q51 {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(4, 5);
        Rectangle copy = new Rectangle(original);
        copy.length = 100;              // change only the copy
        original.display("Original");
        copy.display("Copy");
    }
}
