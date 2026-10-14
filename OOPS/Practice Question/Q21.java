// Q21: Printer with overloaded print()
class Printer {
    void print(int n) {
        System.out.println("Integer: " + n);
    }

    void print(String s) {
        System.out.println("String: " + s);
    }

    void print(int[] arr) {
        System.out.print("Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class Q21 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(100);
        p.print("Hello");
        p.print(new int[] { 1, 2, 3, 4 });
    }
}
