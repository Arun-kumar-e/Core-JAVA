/**
 * 8) 5 number input 
>40 
average 
3. 45 to 50 – D
4. 50 to 60 – C
5. 60 to 80 – B
6. Above 80 – A 
otherwise fail 
*/

import java.util.Scanner;

public class Ques8 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the 5 number ");

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();

        int average = (a+b+c+d+e)/5;

        if (average > 80) {
            System.out.println("A");
        } else if (average > 60 && average <= 80) {
            System.out.println("B");
        } else if(average <= 60 && average > 50) {
            System.out.println("C");
        } else if(average <= 50 && average >44) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }

        s.close();
    }
}
