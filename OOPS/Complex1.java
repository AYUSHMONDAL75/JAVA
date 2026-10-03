class Complex {
    double real;
    double imag;
    static int count = 0;

    Complex() {
        real = 0;
        imag = 0;
        count++;
    }

    Complex(double r, double i) {
        real = r;
        imag = i;
        count++;
    }

    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    static Complex sum(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }

    static Complex difference(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imag - c2.imag);
    }

    static Complex product(Complex c1, Complex c2) {
        double r = c1.real * c2.real - c1.imag * c2.imag;
        double i = c1.real * c2.imag + c1.imag * c2.real;
        return new Complex(r, i);
    }

    double modulus() {
        return Math.sqrt(real * real + imag * imag);
    }

    Complex complement() {
        return new Complex(real, -imag);
    }

    static void displayCount() {
        System.out.println("Number of complex objects created: " + count);
    }
}


public class Complex1 {
    public static void main(String[] args) {

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);

        System.out.print("First complex number: ");
        c1.display();

        System.out.print("Second complex number: ");
        c2.display();

        Complex s = Complex.sum(c1, c2);
        System.out.print("Sum: ");
        s.display();

        Complex d = Complex.difference(c1, c2);
        System.out.print("Difference: ");
        d.display();

        Complex p = Complex.product(c1, c2);
        System.out.print("Product: ");
        p.display();

        System.out.println("Modulus of first number: "+ c1.modulus());

        Complex comp = c1.complement();
        System.out.print("Complement of first number: ");
        comp.display();

        Complex.displayCount();
    }
}