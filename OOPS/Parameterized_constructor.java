class Student{
    String name,subject;
    int age;

    // Parameterized
     Student(String n, String s, int a) {
        name = n;
        subject = s;
        age = a;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Subject: "+subject);
        System.out.println("Age: "+age);
    }
    
}
public class Parameterized_constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Ayush", "Physics", 21);
        s1.display();
    }   
}
