import java.util.Scanner;

public class F12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt() ;
        int n = sc.nextInt();

        for(int i = s ; i <= n ; i++) {
            for(int j = 1 ; j <= 10 ; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("\n");
        }

        sc.close();

    }
}
