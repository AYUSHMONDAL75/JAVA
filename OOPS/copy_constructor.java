class Student{
    String name,subject;
    int age;

    // copy constructor
     Student(String n, String s, int a) {
        name = n;
        subject = s;
        age = a;
    }
    Student(Student s){
        name = s.name;
        subject = s.subject;
        age = s.age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Subject: "+subject);
        System.out.println("Age: "+age);
    }
    
}
public class copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Ayush", "Math", 21);
        Student s2 = new Student(s1); //copy data from s1 

        System.out.println("First student: "); //if display function not written in code then use (s1.name,s1.student,s1.age)
        s1.display();

        System.out.println(" ");

        System.out.println("Second Student: ");
        s2.display();
    }   
}