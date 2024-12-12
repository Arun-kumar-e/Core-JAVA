import java.util.Scanner;

public class arithmetic30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        int c = sc.nextInt();
        int d = sc.nextInt();
        float e = sc.nextFloat();
        float f = sc.nextFloat();
        
        float g = a * b - (c / d) - e + f;
        System.out.println(a + " * " + b + " - (" + c + " / " + d + ") - " + e + " + " + f + " = " + g);
        
        sc.close();
    }
}
