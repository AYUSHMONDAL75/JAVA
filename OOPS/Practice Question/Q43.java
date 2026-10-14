// Q43: BankAccount with static interest rate
class BankAccount {
    static double interestRate = 5;     // shared by all accounts
    double balance;                     // different for each account

    BankAccount(double balance) {
        this.balance = balance;
    }

    double interest() {
        return balance * interestRate / 100;
    }
}

public class Q43 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(10000);
        BankAccount b = new BankAccount(20000);
        System.out.println("Rate " + BankAccount.interestRate + "%: A = " + a.interest() + ", B = " + b.interest());
        BankAccount.interestRate = 7;
        System.out.println("Rate " + BankAccount.interestRate + "%: A = " + a.interest() + ", B = " + b.interest());
    }
}
