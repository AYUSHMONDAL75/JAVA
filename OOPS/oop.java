class pen {
    String color;
    String type;

    void write() {
        System.out.println("writing something");
    }

    void pintcolor(){
        System.out.println(this.color);
    }

    String getColor(){
        return this.color;
    }
}

class Student {
    String  name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {
    }

    
}

class BankAccount {
    public String username;
    private String password;
}
public class oop {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.pintcolor();
        pen2.pintcolor();

        // Student s1 = new Student();
        // s1.name = "Ayush";
        // s1.age = 20;

        // Student s2 = new Student(s1);

        // s2.printinfo();

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Ayush Mondal";
    }
}