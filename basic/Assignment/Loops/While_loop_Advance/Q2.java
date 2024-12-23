import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = 0 , r = 0 , temp = n;

        while (n > 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        if (temp == s) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
        sc.close();
        
    }
    
}
