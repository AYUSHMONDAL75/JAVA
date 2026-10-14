// Q25: Converter with overloaded convert()
class Converter {
    String convert(int n) {
        return "int -> " + String.valueOf(n);
    }

    String convert(double d) {
        return "double -> " + String.valueOf(d);
    }

    String convert(boolean b) {
        return "boolean -> " + String.valueOf(b);
    }
}

public class Q25 {
    public static void main(String[] args) {
        Converter c = new Converter();
        System.out.println(c.convert(10));
        System.out.println(c.convert(3.14));
        System.out.println(c.convert(true));
    }
}
