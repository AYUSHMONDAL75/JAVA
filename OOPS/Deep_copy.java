class Student{
    String name, subject;
    int age;

    Student(String name, String subject, int age){
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    //Deep copy constructor
    Student(Student s){
        this.name = s.name;
        this.subject = s.subject;
        this.age = s.age;
    }
}

public class Deep_copy {
    public static void main(String[] args) {
        int age = 26;
        Student s1 = new Student("Ayush", "Math", age);
        Student s2 = new Student(s1);
        System.out.println("Original student: "+s1.name+ ", " +s1.subject+ ", " +s1.age);
        System.out.println("Copied student: "+s2.name+ ", " +s2.subject+ ", " +s2.age);
    }
}