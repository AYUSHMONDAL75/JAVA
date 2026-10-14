// Q58: ShoppingCart copy constructor
class ShoppingCart {
    String[] items = new String[10];
    int count = 0;

    ShoppingCart() { }

    ShoppingCart(ShoppingCart other) {
        count = other.count;
        for (int i = 0; i < other.count; i++) {
            items[i] = other.items[i];
        }
    }

    void addItem(String item) {
        items[count++] = item;
    }

    void display(String label) {
        System.out.print(label + ": ");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }
}

public class Q58 {
    public static void main(String[] args) {
        ShoppingCart c1 = new ShoppingCart();
        c1.addItem("Milk");
        c1.addItem("Bread");

        ShoppingCart c2 = new ShoppingCart(c1);
        c2.addItem("Eggs");               // only added to copy

        c1.display("Original cart");
        c2.display("Copied cart");
    }
}
