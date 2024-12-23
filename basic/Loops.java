import java.util.Scanner;
public class Loops {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //while loop
        System.out.println("While loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println("While loop: " + i);
            i++;
        }

        //do-while loop
        System.out.println("Do-while loop:");
        int j = 1;
        do {
            System.out.println("Do-while loop: " + j);
            j++;
        } while (j <= 10);

        //for loop
        System.out.println("For loop:");
        for (int k = 1; k <= 10; k++) {
            System.out.println("For loop: " + k);
        }


        //do while loop run at least once even if condition is false
        //for(;true;){} for infinite loop
        //while(true){} for infinite loop
        

        sc.close();
    }
}
