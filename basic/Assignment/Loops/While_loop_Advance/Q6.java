import java.util.Scanner;

public class Q6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Factorial Number");
                int fact = sc.nextInt();
                int factnum = 1;
                for(int i = 1; i <= fact; i++) {
                    factnum = factnum * i;
                }
                System.out.println(factnum);

        sc.close();
    }
}
