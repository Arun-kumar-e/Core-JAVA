import java.util.Scanner;

public class Q11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int s = sc.nextInt();
        int n = sc.nextInt();


        while(s <= n) {
            if (s % 2 != 0) {
                System.out.println(s);
            }
            s++;
        }

        sc.close();
    }
}
