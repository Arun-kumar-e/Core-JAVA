import java.util.Scanner;

public class Divisible {
 
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int a = s.nextInt();
        
        System.out.println("Enter the character: ");

        char ch = s.next().charAt(0);
        if (ch == 'a') {
            if (a%5==0 && a%11==0) {
                System.out.println("Divisible by 5 and 11");
            } else {
                System.out.println("Not divisible by 5 and 11");
            }
    
        }
        else if (ch == 'b') {
            if (a%5==0 || a%11==0) {
                System.out.println("Divisible by 5 or 11");
            } else {
                System.out.println("Not divisible by 5 or 11");
            }
        }
        else {
            System.out.println("Invalid input");
        }
        
        s.close();
    }
}
