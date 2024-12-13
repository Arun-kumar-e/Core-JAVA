/**
 * 6)Write a java program to accept the height of a person in centimeters and categorize the person according to their height.
->meter ===>cm 
mid 
low 
high 
 */

import java.util.Scanner;

public class Ques6 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the height in meter ");

        int h = s.nextInt();

        h = h*100;

        if (h>179) {
            System.out.println("The person in tall");
        } else if (h>=167 && h<=179) {
            System.out.println("The person is has mid height ");
        } else {
            System.out.println("the person is short ");
        }

        s.close();
    }
}
