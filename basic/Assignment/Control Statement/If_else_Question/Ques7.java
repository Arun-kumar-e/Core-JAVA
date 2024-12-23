/*
 * Question 8: Ticket Booking System
Design a ticket booking system for a cinema that calculates the ticket
 price based on the age of the customer. Children (age < 12) get a 50% 
 discount, while seniors (age >= 65) get a 30% discount.
 */
import java.util.Scanner;

public class Ques7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of the customer: ");
        int age = sc.nextInt();
        System.out.println();

        System.out.print("Enter the Price of tickets: ");
        int price = sc.nextInt();
        System.out.println();

        System.out.print("Discount: ");
        float discount ;

        if (age >= 1 && age <= 12) {
            discount = price * 0.5f;
            System.out.println(discount);
        } else if (age >= 60 ) {
           discount = price * 0.3f; 
           System.out.println(discount);
        } else {
            discount = price ;
            System.out.println(discount);
        }

        sc.close();
    }
}
