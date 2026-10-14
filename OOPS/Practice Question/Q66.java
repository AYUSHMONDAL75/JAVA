// Q66: GameCharacter - overloaded constructors, copy constructor, static counter
class GameCharacter {
    static int totalSpawned = 0;
    String name;
    int health, attack;

    GameCharacter() {                        // default stats
        this("Warrior", 100, 10);
    }

    GameCharacter(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        totalSpawned++;
    }

    GameCharacter(GameCharacter other) {     // clone
        this(other.name, other.health, other.attack);
    }

    void display() {
        System.out.println(name + " | Health: " + health + " | Attack: " + attack);
    }
}

public class Q66 {
    public static void main(String[] args) {
        GameCharacter c1 = new GameCharacter();
        GameCharacter c2 = new GameCharacter("Mage", 70, 25);
        GameCharacter c3 = new GameCharacter(c2);
        c1.display();
        c2.display();
        c3.display();
        System.out.println("Total characters spawned = " + GameCharacter.totalSpawned);
    }
}
