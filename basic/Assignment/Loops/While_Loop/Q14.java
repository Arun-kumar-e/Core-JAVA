import java.util.Scanner;

public class Q14 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        int table = sc.nextInt();

        while (i <= 10) {
            System.out.println(table + " * " + i + " = " + (table * i));
            i++;            
        }

        sc.close();
    }
}
