import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int s = sc.nextInt();
        int n = sc.nextInt();
        
        
        while(s <= n) {
            System.out.print(s + " ");
            s++;
        }
        
        sc.close();
    }
    
}
