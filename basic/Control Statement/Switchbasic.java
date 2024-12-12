import java.util.Scanner;

public class Switchbasic {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("One");
                break;
                
            case 2:
                System.out.println("Two");
                break;
                
            default:
                System.out.println("Not found");
        }

        sc.close();
    }
}
