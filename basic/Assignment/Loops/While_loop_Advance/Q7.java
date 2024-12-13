import java.util.Scanner;

public class Q7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Fibonacci Number");
                int fib = sc.nextInt();
                int a = 0, b = 1, d = 0;
                for(int i = 2; i < fib; i++) {
                    d = a + b;
                    System.out.println(d);

                    a = b;
                    b = d;
                }

        sc.close();
                
    }
}
