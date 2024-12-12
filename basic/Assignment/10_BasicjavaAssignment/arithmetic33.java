import java.util.Scanner;

public class arithmetic33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        int f = sc.nextInt();
        int g = sc.nextInt();
        
        float h = a * b - (c - d) + e - f + g;
        System.out.println(a + " * " + b + " - (" + c + " - " + d + ") + " + e + " - " + f + " + " + g + " = " + h);
        
        sc.close();
    }
}

