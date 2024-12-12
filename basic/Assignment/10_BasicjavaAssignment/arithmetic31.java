import java.util.Scanner;

public class arithmetic31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        
        int f = a * b + (c - d) / b + e;
        System.out.println(a + " * " + b + " + (" + c + " - " + d + ") / " + b + " + " + e + " = " + f);
        
        sc.close();
    }
}

