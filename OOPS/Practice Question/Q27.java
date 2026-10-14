// Q27: Discount with overloaded applyDiscount()
class Discount {
    double applyDiscount(double price, double flatAmount) {       // flat amount
        return price - flatAmount;
    }

    double applyDiscount(double price, int percent) {             // percentage
        return price - (price * percent / 100);
    }
}

public class Q27 {
    public static void main(String[] args) {
        Discount d = new Discount();
        System.out.println("Flat Rs.200 off on 1000 = " + d.applyDiscount(1000, 200.0));
        System.out.println("20% off on 1000 = " + d.applyDiscount(1000, 20));
    }
}
