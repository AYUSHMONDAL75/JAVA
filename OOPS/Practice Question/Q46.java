// Q46: IDGenerator with static variable and method
class IDGenerator {
    static int nextId = 1;

    static int generateId() {
        return nextId++;
    }
}

class Customer {
    int id;
    String name;

    Customer(String name) {
        this.name = name;
        this.id = IDGenerator.generateId();
    }
}

public class Q46 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Amit");
        Customer c2 = new Customer("Riya");
        Customer c3 = new Customer("John");
        System.out.println(c1.name + " -> ID " + c1.id);
        System.out.println(c2.name + " -> ID " + c2.id);
        System.out.println(c3.name + " -> ID " + c3.id);
    }
}
