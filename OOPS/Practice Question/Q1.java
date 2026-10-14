// Q1: Student class - find student with highest total marks
class Student {
    String name;
    int rollNo;
    int m1, m2, m3;

    Student(String name, int rollNo, int m1, int m2, int m3) {
        this.name = name;
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int total() {
        return m1 + m2 + m3;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        s[0] = new Student("Amit", 1, 80, 70, 90);
        s[1] = new Student("Riya", 2, 95, 85, 90);
        s[2] = new Student("John", 3, 60, 75, 65);
        s[3] = new Student("Sara", 4, 88, 92, 79);
        s[4] = new Student("Karan", 5, 70, 68, 72);

        Student top = s[0];
        for (int i = 1; i < s.length; i++) {
            if (s[i].total() > top.total()) {
                top = s[i];
            }
        }
        System.out.println("Highest total: " + top.name + " (Roll " + top.rollNo + ") = " + top.total());
    }
}
