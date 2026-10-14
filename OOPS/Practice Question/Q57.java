// Q57: Person with Address - shallow vs deep copy
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy: both persons share the SAME Address object
    static Person shallowCopy(Person p) {
        return new Person(p.name, p.address);
    }

    // Deep copy constructor: creates a NEW Address object
    Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address.city);
    }
}

public class Q57 {
    public static void main(String[] args) {
        Person p1 = new Person("Amit", new Address("Delhi"));

        Person shallow = Person.shallowCopy(p1);
        shallow.address.city = "Mumbai";
        System.out.println("After shallow copy change -> p1 city: " + p1.address.city);

        Person p2 = new Person("Riya", new Address("Pune"));
        Person deep = new Person(p2);
        deep.address.city = "Chennai";
        System.out.println("After deep copy change    -> p2 city: " + p2.address.city);
    }
}
