// Q33: Employee with overloaded constructors
class Employee {
    String name, department;
    double salary;

    Employee(String name) {
        this.name = name;
        this.salary = 0;
        this.department = "Not assigned";
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = "Not assigned";
    }

    Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    void display() {
        System.out.println(name + " | " + salary + " | " + department);
    }
}

public class Q33 {
    public static void main(String[] args) {
        new Employee("Amit").display();
        new Employee("Riya", 40000).display();
        new Employee("John", 60000, "IT").display();
    }
}
