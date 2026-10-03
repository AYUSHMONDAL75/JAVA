class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    void bark(){
        System.err.println("Dog barks");
    }
}

public class Single_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}