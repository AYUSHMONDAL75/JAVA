class Student{
    String name,subject;
    int age;

    // non Parameterized
     Student() {
        name = "Ayush";
        subject = "Math";
        age = 21;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Subject: "+subject);
        System.out.println("Age: "+age);
    }
    
}
public class non_Parameterized_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }   
}
