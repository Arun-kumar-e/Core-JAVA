import java.util.Scanner;

public class arithmetic28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        int d = sc.nextInt();
        
        float f = a * b - c / d;
        System.out.println(a + " * " + b + " - " + c + " / " + d + " = " + f);
        
        sc.close();
    }
}
