// Q53: Employee copy before raise
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    Employee(Employee other) {
        this.name = other.name;
        this.salary = other.salary;
    }

    void giveRaise(double percent) {
        salary = salary + salary * percent / 100;
    }
}

public class Q53 {
    public static void main(String[] args) {
        Employee emp = new Employee("Amit", 50000);
        Employee before = new Employee(emp);   // backup before raise
        emp.giveRaise(10);
        System.out.println("Before raise: " + before.salary);
        System.out.println("After raise : " + emp.salary);
    }
}
