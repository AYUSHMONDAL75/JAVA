// Q49: Product with static total revenue
class Product {
    static double totalRevenue = 0;
    String name;
    double price;
    int sold;

    Product(String name, double price, int sold) {
        this.name = name;
        this.price = price;
        this.sold = sold;
        totalRevenue += price * sold;   // add to shared total
    }

    static double getTotalRevenue() {
        return totalRevenue;
    }
}

public class Q49 {
    public static void main(String[] args) {
        new Product("Pen", 10, 100);
        new Product("Book", 250, 20);
        new Product("Bag", 500, 5);
        System.out.println("Total revenue = " + Product.getTotalRevenue());
    }
}
