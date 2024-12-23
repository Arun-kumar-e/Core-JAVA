/* 
 * Question 3: Leap Year Checker
Write a Java program that checks if a given year is a 
leap year or not. Leap years are divisible by 4, but 
years divisible by 100 are not leap years unless they 
are also divisible by 400.
*/
import java.util.Scanner;

public class Ques3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Year: ");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        sc.close();
    }
}
