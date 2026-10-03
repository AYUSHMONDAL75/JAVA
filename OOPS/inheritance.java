class Shape{
    public static void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
    public static void area(int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

//multi level inheritance
class EquilateralTriangle extends Triangle{
    public static void area(int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

class  Circle extends  Shape{
    public static void area(int r) {
        System.out.println((3.14145) * r * r);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
    }
}