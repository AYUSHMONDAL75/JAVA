// Q52: Point copy constructor and same-coordinates check
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    boolean sameCoordinates(Point other) {
        return x == other.x && y == other.y;
    }
}

public class Q52 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(p1);
        System.out.println("Same coordinates? " + p1.sameCoordinates(p2));
        System.out.println("Same object? " + (p1 == p2));
    }
}
