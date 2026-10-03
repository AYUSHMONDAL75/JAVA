class BankAccount{
    String holderName, accountType;
    int accountNumber;
    double balance;

    public BankAccount(String name, int number, String type, double balance) {
        this.holderName = name;
        this.accountNumber = number;
        this.accountType = type;
        this.balance = balance;
    }
    
    void chechBalance(){
        System.out.println("Current balance = Rs. "+balance);
    }

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited Rs. :"+amount);
        }else{
            System.out.println("invalid deposit amount.");
        }
    }

    void withdraw(double amount){
        if(amount <= 0){
            System.out.println("invalid withdraw");
            return;
        }
        if(accountType.equalsIgnoreCase("savings")){
            if(balance - amount >= 1000){
                balance -= amount;
            }
        }
    }
}

public class banking_management_system{
    
}
