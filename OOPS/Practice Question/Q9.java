// Q9: Compare two Person objects by age
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void compareAge(Person other) {
        if (this.age > other.age) {
            System.out.println(this.name + " is older than " + other.name);
        } else if (this.age < other.age) {
            System.out.println(other.name + " is older than " + this.name);
        } else {
            System.out.println(this.name + " and " + other.name + " are of the same age");
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        Person a = new Person("Amit", 25);
        Person b = new Person("Riya", 30);
        a.compareAge(b);
    }
}
