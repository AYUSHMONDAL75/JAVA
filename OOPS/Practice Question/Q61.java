// Q61: BankAccount - overloaded constructors, static rate, copy constructor
class BankAccount {
    static double interestRate = 4.5;
    static int nextId = 1;
    int id;
    double balance;

    BankAccount() {                         // new account
        id = nextId++;
        balance = 0;
    }

    BankAccount(int id, double balance) {   // existing account
        this.id = id;
        this.balance = balance;
    }

    BankAccount(BankAccount other) {        // snapshot
        this.id = other.id;
        this.balance = other.balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void display(String label) {
        System.out.println(label + " -> ID: " + id + ", Balance: " + balance + ", Rate: " + interestRate + "%");
    }
}

public class Q61 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount(500, 8000);
        a1.deposit(2000);

        BankAccount snapshot = new BankAccount(a1);   // snapshot of a1
        a1.deposit(1000);

        a1.display("Current account");
        snapshot.display("Snapshot       ");
        a2.display("Existing account");
    }
}
