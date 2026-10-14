// Q15: Inventory search by name
class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class Inventory {
    Product[] items;

    Inventory(Product[] items) {
        this.items = items;
    }

    void search(String name) {
        for (Product p : items) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + p.name + ", Price = " + p.price + ", Quantity = " + p.quantity);
                return;
            }
        }
        System.out.println("Product '" + name + "' not found");
    }
}

public class Q15 {
    public static void main(String[] args) {
        Product[] list = { new Product("Pen", 10, 100), new Product("Book", 250, 20) };
        Inventory inv = new Inventory(list);
        inv.search("book");
        inv.search("Laptop");
    }
}
