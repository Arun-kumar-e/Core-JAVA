import java.util.Scanner;

public class F13 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int s = sc.nextInt() ;
        int n = sc.nextInt();

        for(int i = 1 ; i <= 100 ; i++) {
            if (i % s == 0 && i % n == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
