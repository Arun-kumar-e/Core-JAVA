import java.util.Scanner;

public class NumberCheck {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int a = s.nextInt();

        if (a>0) {
            System.out.println("Positive number " + a );
        } else if (a<0) {
            System.out.println("Negative number " + a );
        } else {
            System.out.println(" Number is Zero " + a);
        }

        s.close();
    }
}
