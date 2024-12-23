//1)C program to find out whether a given year is a leap year or not:


import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");

        int year = sc.nextInt();

        if(year %4 == 0){
            System.out.println(year + " is a Leap year");
        }

        sc.close();
    }
}
