/*
1)write a program to read a week day number and print weekday name using switch 
eg 1 =>sunday 
1 sunday 
*/import java.util.Scanner;

public class Ques1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Day of Week: ");
        int Week = sc.nextInt();
        
        switch(Week) {
            case 1:
                System.out.println("Monday");                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
        }

        sc.close();
    }
}
