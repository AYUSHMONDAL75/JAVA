// Q5: Book selling and stock update
class Book {
    String title, author;
    double price;
    int stock;

    Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    void sell(int qty) {
        if (qty <= stock) {
            stock -= qty;
            System.out.println("Sold " + qty + " copies of " + title + ". Bill = " + (qty * price) + ", Stock left = " + stock);
        } else {
            System.out.println("Not enough stock! Only " + stock + " available.");
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James", 450, 10);
        b.sell(3);
        b.sell(5);
        b.sell(4);
    }
}
