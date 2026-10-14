// Q60: Student - overloaded constructors + copy constructor + static counter
class Student {
    static int totalStudents = 0;
    String name;
    int rollNo;
    int marks;

    Student() {
        this("Unknown", 0, 0);
    }

    Student(String name) {
        this(name, 0, 0);
    }

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        totalStudents++;
    }

    Student(Student other) {
        this(other.name, other.rollNo, other.marks);
    }

    void display() {
        System.out.println(name + " | " + rollNo + " | " + marks);
    }
}

public class Q60 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Amit");
        Student s3 = new Student("Riya", 3, 92);
        Student s4 = new Student(s3);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        System.out.println("Total students created = " + Student.totalStudents);
    }
}
