/*
 * Q4
 * write a program to create a simple calculator 

*/
import java.util.Scanner;

public class Ques4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':    
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        sc.close();
    }
}
