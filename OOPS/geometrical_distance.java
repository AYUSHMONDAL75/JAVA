class point {
    double x1, y1, x2, y2;

    point(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public static double calculate(double x1, double x2, double y1, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }
}
public class geometrical_distance {
    public static void main(String[] args) {
        point p1 = new point(2, 3, 6, 6);
        double result = p1.calculate(p1.x1, p1.x2, p1.y1, p1.y2);
        System.out.println("Distance = " + result);
    }
}