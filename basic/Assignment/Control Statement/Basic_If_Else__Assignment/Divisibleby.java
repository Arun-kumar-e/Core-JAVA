import java.util.Scanner;

public class Divisibleby {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if (a>0) {
            if (a%5==0 && a%11==0) {
                System.out.println("Divisible by 5 and 11");
            } else {
                System.out.println("Not divisible by 5 and 11");
            }
        } else {
            System.out.println("Nuber is nor Interger ");
        }

        s.close();
    }
}
