public class Question3 {
    
    public static void main(String[] args) {
        
        
        BankAccount b = new BankAccount();
        b.setter(1234, 5454.54);
        b.deposit(1000);
        b.withdraw(500);
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());

    }
}

class BankAccount {

    private int accountNumber;
    private double balance;

    void setter(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double depo) {
        if (depo > 0) {
            balance += depo;
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double wido) {
        if (wido > 0 && wido <= balance) {
            balance -= wido;
        } else {
            System.out.println("Invalid amount");
        }
    }

    double getBalance() {
        return balance;
    }

    int getAccountNumber() {
        return accountNumber;
    }

}
