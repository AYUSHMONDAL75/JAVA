// Q14: Generic Shape with type field
class Shape {
    String type;
    double dim1, dim2;

    Shape(String type, double dim1, double dim2) {
        this.type = type;
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double calculateArea() {
        if (type.equals("circle")) {
            return Math.PI * dim1 * dim1;     // dim1 = radius
        } else if (type.equals("square")) {
            return dim1 * dim1;               // dim1 = side
        } else if (type.equals("rectangle")) {
            return dim1 * dim2;
        } else {
            return 0;
        }
    }
}

public class Q14 {
    public static void main(String[] args) {
        Shape s1 = new Shape("circle", 5, 0);
        Shape s2 = new Shape("square", 4, 0);
        Shape s3 = new Shape("rectangle", 4, 6);
        System.out.println("Circle area = " + s1.calculateArea());
        System.out.println("Square area = " + s2.calculateArea());
        System.out.println("Rectangle area = " + s3.calculateArea());
    }
}
