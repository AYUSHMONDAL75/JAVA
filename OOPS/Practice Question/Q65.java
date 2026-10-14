// Q65: Product - constructor overloading, copy constructor for discount, static average price
class Product {
    static double totalPrice = 0;
    static int count = 0;
    String name;
    double price;

    Product(String name) {
        this(name, 100);
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        totalPrice += price;
        count++;
    }

    // Copy constructor with discount percentage
    Product(Product other, double discountPercent) {
        this(other.name + " (Discounted)", other.price - other.price * discountPercent / 100);
    }

    static double averagePrice() {
        return totalPrice / count;
    }
}

public class Q65 {
    public static void main(String[] args) {
        Product p1 = new Product("Pen");
        Product p2 = new Product("Bag", 500);
        Product p3 = new Product(p2, 20);       // 20% off duplicate
        System.out.println(p1.name + " = " + p1.price);
        System.out.println(p2.name + " = " + p2.price);
        System.out.println(p3.name + " = " + p3.price);
        System.out.println("Average price = " + Product.averagePrice());
    }
}
