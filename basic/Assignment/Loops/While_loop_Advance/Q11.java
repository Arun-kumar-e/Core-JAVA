import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Neon Number");
                int ne = sc.nextInt();
                int sq = ne * ne;
                int sum1 = 0;
                while(sq > 0) {
                    int rem = sq % 10;
                    sum1 = sum1 + rem;
                    sq = sq / 10;
                }
                if(sum1 == ne) {
                    System.out.println("Neon Number");
                } else {
                    System.out.println("Not Neon Number");
                }

        sc.close();
    }
    
}
