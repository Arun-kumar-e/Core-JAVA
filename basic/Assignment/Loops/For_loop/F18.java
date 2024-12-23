import java.util.Scanner;

public class F18 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number " );

        int num = sc.nextInt();

        System.out.println("Operation to perform(factorial or reverse) ");
        String op = sc.next();

        if (op.equals("factorial")) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        } else if (op.equals("reverse")) {
            int rev = 0;
            while (num > 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            System.out.println("Reverse of " + num + " is: " + rev);
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
