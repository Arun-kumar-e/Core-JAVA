import java.util.Scanner;

public class Q1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        int s = 0 , r = 0 ;
        
        while (n > 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        System.out.println("Reverse number is: " + s);
        sc.close();
        
    }
}
