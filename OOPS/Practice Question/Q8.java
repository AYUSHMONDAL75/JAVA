// Q8: Total inventory value
class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double value() {
        return price * quantity;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Product[] p = {
            new Product("Pen", 10, 100),
            new Product("Notebook", 50, 40),
            new Product("Bag", 500, 5)
        };
        double total = 0;
        for (Product item : p) {
            total += item.value();
        }
        System.out.println("Total inventory value = " + total);
    }
}
