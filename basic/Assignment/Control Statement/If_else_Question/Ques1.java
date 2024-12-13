/*
 * Question 1: Tax Calculator
Write a Java program that calculates income tax for individuals based on the following criteria:

Income <= 10,000: No tax
10,001 - 30,000: 10% tax
30,001 - 50,000: 20% tax
Income > 50,000: 30% tax
 */
import java.util.Scanner;

public class Ques1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the income: ");
        int income = sc.nextInt();
        
        float tax ;
        if(income < 10001) {
            System.out.println("No tax");
        } else if(income < 30001 && income > 10000) {
            tax = income * 0.1f;
            System.out.println(tax);
        } else if(income < 50001 && income > 30000) {
            tax = income * 0.2f;
            System.out.println(tax);
        } else {
            tax = income * 0.3f;
            System.out.println(tax);
        }

        sc.close();
    }
}
