// Q18: Library issueBook and returnBook
class Library {
    String[] books = { "Java", "Python", "C++" };
    boolean[] available = { true, true, true };

    int find(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(title)) return i;
        }
        return -1;
    }

    void issueBook(String title) {
        int i = find(title);
        if (i == -1) {
            System.out.println(title + " not found in library");
        } else if (available[i]) {
            available[i] = false;
            System.out.println(title + " issued");
        } else {
            System.out.println(title + " is already issued");
        }
    }

    void returnBook(String title) {
        int i = find(title);
        if (i == -1) {
            System.out.println(title + " not found in library");
        } else if (!available[i]) {
            available[i] = true;
            System.out.println(title + " returned");
        } else {
            System.out.println(title + " was not issued");
        }
    }
}

public class Q18 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.issueBook("Java");
        lib.issueBook("Java");
        lib.returnBook("Java");
        lib.returnBook("Java");
    }
}
