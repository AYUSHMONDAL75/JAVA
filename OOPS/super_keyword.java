class Animal{
    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse(){
        super();
        System.out.println("Horse constructor is called");
    }
}

public class super_keyword {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}
