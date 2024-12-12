import java.util.Scanner;

public class arithmetic29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        float a = sc.nextFloat();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        
        float f = a * (b - c) / d + e;
        System.out.println(a + " * (" + b + " - " + c + ") / " + d + " + " + e + " = " + f);
        
        sc.close();
    }
}
