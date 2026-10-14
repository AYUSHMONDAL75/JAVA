// Q34: Point with default and parameterized constructors
class Point {
    int x, y;

    Point() {               // origin
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}

public class Q34 {
    public static void main(String[] args) {
        new Point().display();
        new Point(5, 8).display();
    }
}
