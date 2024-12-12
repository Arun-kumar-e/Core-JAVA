import java.util.Scanner;

public class arithmetic24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a * b;
        System.out.println(a + " * " + b + " = " + result);

        sc.close();
    }
}
