// Q62: Employee management - overloaded methods and constructors, static counter
class Employee {
    static int totalEmployees = 0;
    String name;
    double basic;

    Employee(String name) {
        this(name, 20000);
    }

    Employee(String name, double basic) {
        this.name = name;
        this.basic = basic;
        totalEmployees++;
    }

    double calculateSalary() {                       // basic only
        return basic;
    }

    double calculateSalary(double bonus) {           // basic + bonus
        return basic + bonus;
    }

    double calculateSalary(double bonus, double deduction) {   // basic + bonus - deduction
        return basic + bonus - deduction;
    }
}

public class Q62 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit");
        Employee e2 = new Employee("Riya", 40000);
        System.out.println(e1.name + ": " + e1.calculateSalary());
        System.out.println(e2.name + ": " + e2.calculateSalary(5000));
        System.out.println(e2.name + ": " + e2.calculateSalary(5000, 2000));
        System.out.println("Total employees = " + Employee.totalEmployees);
    }
}
