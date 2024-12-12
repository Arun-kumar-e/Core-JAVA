import java.util.Scanner;

public class Max10 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = s.nextInt();

        if (a>10) {
            System.out.println("Greater than 10");
        }else {
            System.out.println("Less than 10");
        }


        s.close();
    }
}
