import java.util.Scanner;

public class Q8 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int no = 0;

        while (num > 0) {
            num = num / 10;
            no = no + 1;
        }

        System.out.println("Digit count is " + no);

        sc.close();
    }
}
