// Q37: Fraction with two constructors
class Fraction {
    int numerator, denominator;

    Fraction(int whole) {
        numerator = whole;
        denominator = 1;
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void display() {
        System.out.println(numerator + "/" + denominator);
    }
}

public class Q37 {
    public static void main(String[] args) {
        new Fraction(5).display();
        new Fraction(3, 4).display();
    }
}
