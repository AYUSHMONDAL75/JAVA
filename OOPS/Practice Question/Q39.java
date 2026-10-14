// Q39: Account - new account (auto ID) vs existing account
class Account {
    static int nextId = 1000;
    int id;
    double balance;

    Account() {                         // new account
        id = nextId++;
        balance = 0;
    }

    Account(int id, double balance) {   // existing account
        this.id = id;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account ID: " + id + ", Balance: " + balance);
    }
}

public class Q39 {
    public static void main(String[] args) {
        new Account().display();
        new Account().display();
        new Account(555, 7500).display();
    }
}
