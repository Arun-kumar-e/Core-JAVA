/*
 * Question 5: Menu Selection
Design a simple restaurant menu system that takes a
 customer's choice (1-3) and displays the selected food
  item and its price. Use if-else if-else statements.
 */
import java.util.Scanner;
public class Ques5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the choice (1-3): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Choice 1 selected.");
        } else if (choice == 2) {
            System.out.println("Choice 2 selected.");
        } else if (choice == 3) {
            System.out.println("Choice 3 selected.");
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
