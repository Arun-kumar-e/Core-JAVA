import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Perfect Number");
                int per = sc.nextInt();
                int sum = 0;
                for(int i = 1; i < per; i++) {
                    if(per % i == 0) {
                        sum = sum + i;
                    }
                }
                if(sum == per) {
                    System.out.println("Perfect Number");
                } else {
                    System.out.println("Not Perfect Number");
                }

        sc.close();
    }
    
}
