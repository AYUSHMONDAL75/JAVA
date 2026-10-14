// Q41: Employee static bonus method
class Employee {
    String name;
    double salary;
    static double bonusPercent = 10;      // same for all employees

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    static double calculateBonus(double salary) {
        return salary * bonusPercent / 100;
    }
}

public class Q41 {
    public static void main(String[] args) {
        Employee e = new Employee("Amit", 50000);
        System.out.println("Bonus at " + Employee.bonusPercent + "% = " + Employee.calculateBonus(e.salary));
        Employee.bonusPercent = 15;       // change for the whole company
        System.out.println("Bonus at " + Employee.bonusPercent + "% = " + Employee.calculateBonus(e.salary));
    }
}
