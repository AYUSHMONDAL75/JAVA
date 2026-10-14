// Q44: Student with static school name
class Student {
    static String schoolName = "Green Valley School";   // common to all
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println(name + " | Roll: " + rollNo + " | School: " + schoolName);
    }
}

public class Q44 {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 1);
        Student s2 = new Student("Riya", 2);
        s1.display();
        s2.display();
        Student.schoolName = "Sunrise Public School";    // changes for everyone
        s1.display();
        s2.display();
    }
}
