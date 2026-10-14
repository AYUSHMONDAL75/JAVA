// Q50: Student copy constructor
class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    Student(Student other) {            // copy constructor
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }

    void display() {
        System.out.println(name + " | " + rollNo + " | " + marks);
    }
}

public class Q50 {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 1, 85);
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}
