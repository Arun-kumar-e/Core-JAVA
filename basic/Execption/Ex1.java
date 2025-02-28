import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[2];

        try{
            System.out.println("Enter the first number: ");
            arr[0] = sc.nextInt();
            System.out.println("Enter the second number: ");
            arr[1] = sc.nextInt();

            try {
                System.out.println("Enter the index of numanotor: ");
                int nindex = sc.nextInt();
                int numanotor = arr[nindex];

                System.out.println("Enter the index of denuminator: ");
                int dindex = sc.nextInt();
                int denuminator = arr[dindex];

                double result = numanotor / denuminator;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
