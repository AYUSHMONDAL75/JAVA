// Q64: Library - overloaded addBook(), copy constructor for book record, static total
class BookRecord {
    String title, author;

    BookRecord(String title, String author) {
        this.title = title;
        this.author = author;
    }

    BookRecord(BookRecord other) {          // copy constructor
        this.title = other.title;
        this.author = other.author;
    }
}

class Library {
    static int totalBooks = 0;
    BookRecord[] books = new BookRecord[20];

    void addBook(String title) {
        books[totalBooks++] = new BookRecord(title, "Unknown");
    }

    void addBook(String title, String author) {
        books[totalBooks++] = new BookRecord(title, author);
    }

    void addBook(BookRecord record) {
        books[totalBooks++] = new BookRecord(record);   // add a copy
    }

    void display() {
        for (int i = 0; i < totalBooks; i++) {
            System.out.println(books[i].title + " by " + books[i].author);
        }
    }
}

public class Q64 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java");
        lib.addBook("Python", "Guido");
        lib.addBook(new BookRecord("C++", "Bjarne"));
        lib.display();
        System.out.println("Total books in library = " + Library.totalBooks);
    }
}
