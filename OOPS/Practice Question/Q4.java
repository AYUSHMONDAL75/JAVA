// Q4: Employee array sorted by salary
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Employee[] e = {
            new Employee("Amit", 1, 50000),
            new Employee("Riya", 2, 30000),
            new Employee("John", 3, 70000),
            new Employee("Sara", 4, 40000)
        };

        // Bubble sort by salary (ascending)
        for (int i = 0; i < e.length - 1; i++) {
            for (int j = 0; j < e.length - 1 - i; j++) {
                if (e[j].salary > e[j + 1].salary) {
                    Employee temp = e[j];
                    e[j] = e[j + 1];
                    e[j + 1] = temp;
                }
            }
        }

        System.out.println("Employees sorted by salary:");
        for (Employee emp : e) {
            System.out.println(emp.id + " " + emp.name + " " + emp.salary);
        }
    }
}
