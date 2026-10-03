// This is know as method overloading
class Student{
    String name;
    int age;

    public static void printinfo(String name) {
        System.out.println(name);
    }
    
    public static void printinfo(int age) {
        System.out.println(age);
    }

    public static void printinfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printinfo("Ayush", 21);
    }
}