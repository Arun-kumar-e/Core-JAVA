import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int i = 100;
        int n = sc.nextInt();
        int m = sc.nextInt();

        while (i >= 1) {
            if (i % m==0 && n % n== 0) {
                System.out.println(i);
            }
            i--;
        }
        sc.close();
    }
}
