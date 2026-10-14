// Q54: Book copy constructor with deep copy of reviews array
class Book {
    String title;
    String[] reviews;

    Book(String title, String[] reviews) {
        this.title = title;
        this.reviews = reviews;
    }

    Book(Book other) {
        this.title = other.title;
        this.reviews = new String[other.reviews.length];   // new array (deep copy)
        for (int i = 0; i < other.reviews.length; i++) {
            this.reviews[i] = other.reviews[i];
        }
    }

    void display(String label) {
        System.out.print(label + ": " + title + " -> ");
        for (String r : reviews) {
            System.out.print("[" + r + "] ");
        }
        System.out.println();
    }
}

public class Q54 {
    public static void main(String[] args) {
        Book b1 = new Book("Java", new String[] { "Great", "Useful" });
        Book b2 = new Book(b1);
        b2.reviews[0] = "Boring";           // change only copy
        b1.display("Original");
        b2.display("Copy");
    }
}
