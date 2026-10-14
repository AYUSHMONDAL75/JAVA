// Q23: Volume with overloaded volume()
class Volume {
    double volume(double side) {                              // cube
        return side * side * side;
    }

    double volume(double l, double b, double h) {             // cuboid
        return l * b * h;
    }

    double volume(double radius, boolean isSphere) {          // sphere
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

public class Q23 {
    public static void main(String[] args) {
        Volume v = new Volume();
        System.out.println("Cube volume = " + v.volume(3));
        System.out.println("Cuboid volume = " + v.volume(2, 3, 4));
        System.out.println("Sphere volume = " + v.volume(3, true));
    }
}
