// Q68: Box class - isLargerThan(Box b)
class Box {
    double length, breadth, height;

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double volume() {
        return length * breadth * height;
    }

    boolean isLargerThan(Box b) {
        return this.volume() > b.volume();
    }
}

public class Q68 {
    public static void main(String[] args) {
        Box b1 = new Box(2, 3, 4);
        Box b2 = new Box(5, 5, 2);
        Box b3 = new Box(3, 3, 3);

        Box largest = b1;
        if (b2.isLargerThan(largest)) largest = b2;
        if (b3.isLargerThan(largest)) largest = b3;

        System.out.println("Volumes: " + b1.volume() + ", " + b2.volume() + ", " + b3.volume());
        System.out.println("Largest box volume = " + largest.volume());
    }
}
