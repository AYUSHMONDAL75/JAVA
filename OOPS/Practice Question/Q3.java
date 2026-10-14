// Q3: BankAccount with deposit and withdraw
class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". Balance = " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". Balance = " + balance);
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, "Amit", 5000);
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.withdraw(10000);
    }
}
