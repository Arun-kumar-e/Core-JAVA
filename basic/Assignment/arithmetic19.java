import java.util.Scanner;

public class arithmetic19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int a = sc.nextInt();
        
        int b = sc.nextInt();
        
        int c = a - b;
        
        System.out.println("Subtraction of " + a + " and " + b + " is " + c);
        
        sc.close();
    }

}
