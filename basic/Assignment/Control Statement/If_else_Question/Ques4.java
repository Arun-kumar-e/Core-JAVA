/*
 * Question 4: Time of Day Greeting
Create a program that asks for the time of day
 (morning, afternoon, evening) and then greets the user 
 accordingly.For example, "Good morning!" if the time is morning.
 */
import java.util.Scanner; 
public class Ques4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Time in 24hr: ");
        int time = sc.nextInt();

        if (time >= 0 && time < 12) {
            System.out.println("Good Morning");
        } else if (time >= 12 && time < 16) {
            System.out.println("Good Afternoon");
        } else if (time >= 16 && time < 20) {
            System.out.println("Good Evening");
        } else if (time >= 20 && time < 24) {
            System.out.println("Good Night");
        } else {
            System.out.println("Invalid Time");
        }

        sc.close();
    }
}
