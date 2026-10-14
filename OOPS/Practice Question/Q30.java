// Q30: Student with three constructors
class Student {
    String name;
    int rollNo;
    int marks;

    Student() {
        name = "Unknown";
        rollNo = 0;
        marks = 0;
    }

    Student(String name) {
        this.name = name;
        rollNo = 0;
        marks = 0;
    }

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println(name + " | Roll: " + rollNo + " | Marks: " + marks);
    }
}

public class Q30 {
    public static void main(String[] args) {
        new Student().display();
        new Student("Amit").display();
        new Student("Riya", 2, 90).display();
    }
}
