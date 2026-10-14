// Q32: Book with overloaded constructors
class Book {
    String title, author;
    double price;

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " by " + author + ", Price: " + price);
    }
}

public class Q32 {
    public static void main(String[] args) {
        new Book("Java Basics").display();
        new Book("Java Basics", "James", 450).display();
    }
}
