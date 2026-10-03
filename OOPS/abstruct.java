abstract class Animal{
    String color;
    Animal(){
        System.out.println("\nAnimal Constructor call");
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract  void walk();
}

class Horse extends Animal{

    public Horse() {
        System.out.println("Horse constructor call");
    }
    
    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends  Horse{

    public Mustang() {
        System.out.println("Mustang Constructor call\n");
    }
    
}

class Chiken extends Animal{
    void changeColor(){
        color = "Yellow";
    }

    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class abstruct {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chiken c = new Chiken();
        c.eat();
        c.walk();

        System.out.println("");

        Mustang myHorse = new Mustang();
    }
}