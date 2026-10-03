class Student{
    String name;
    int id;
    int age;

    Student(){
        id = 0;
        name = "Bob";
        age = 15;
    }

    Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.err.println("Age: "+age);
    }  
}
public class constructor_overloading {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Ayush", 101, 21);
        Student s3 = new Student("Sonu", 20);

        System.out.println("\nStudent1");
        s1.display();
        
        System.out.println("\nStudent2");
        s2.display();

        System.out.println("\nStudent3");
        s3.display();
        
    }
}