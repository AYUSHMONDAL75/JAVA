// Q24: Greeting with overloaded greet()
class Greeting {
    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    void greet(String name, String timeOfDay) {
        System.out.println("Good " + timeOfDay + ", " + name + "!");
    }
}

public class Q24 {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.greet();
        g.greet("Amit");
        g.greet("Amit", "Morning");
    }
}
