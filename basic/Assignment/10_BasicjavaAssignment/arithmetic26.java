
import java.util.Scanner;

public class arithmetic26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int f = a + b + c + d + e;
        System.out.println("Sum of " + a + ", " + b + ", " + c + ", " + d + ", " + e + " is " + f);
        
        sc.close();
    }
}