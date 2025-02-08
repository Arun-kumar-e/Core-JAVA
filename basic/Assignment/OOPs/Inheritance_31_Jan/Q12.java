class BankAccount {
    void deposit() {
        System.out.println("Deposit");
    }    
}

class SavingsAccount extends BankAccount {
    void SavingsAccountInterest() {
        System.out.println("Savings Account Interest");
    }
}

class CheckingAccount extends SavingsAccount {
    void CheckingAccountInterest() {
        System.out.println("Checking Account Interest");
    }
}
public class Q12 {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount();
        c.deposit();
        c.SavingsAccountInterest();
        c.CheckingAccountInterest();
    }
}
