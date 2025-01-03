public class Inheritance10 {
    
    public static void main(String[] args) {
        
        CheckingAccount ca = new CheckingAccount();
        ca.balance = 1000.0;
        ca.interestRate = 0.01;
        System.out.println("Checking Account Interest: " + ca.calculateInterest2());
        
    }
}

class BankAccount {
    double balance;
    double interestRate;
    
    double calculateInterest() {
        return balance * interestRate;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    
    double calculateInterest1() {
        return balance * interestRate;
    }
}

class CheckingAccount extends SavingsAccount {
    double interestRate;
    
    double calculateInterest2() {
        return balance * interestRate;
    }
}

