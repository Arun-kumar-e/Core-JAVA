interface Payment{
    void processPayment(double amount);
}

class CreditCardPayment implements Payment{
   public void processPayment(double amount){
          System.out.println("Credit card payment of amount " + amount + " is processed");
      }
}

class DebitCardPayment implements Payment{
    public void processPayment(double amount){
        System.out.println("Debit card payment of amount " + amount + " is processed");
    }
}
public class Q5 {
    public static void main(String[] args) {
        CreditCardPayment c = new CreditCardPayment();
        DebitCardPayment d = new DebitCardPayment();
        c.processPayment(1000);
        d.processPayment(2000);
    }
}
