import java.util.Scanner;

public class arithmetic32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        
        float f = a + b * (c - d) / e ;
        System.out.println(a + " + " + b + " * (" + c + " - " + d + ") / " + e +  " = " + f);
        
        sc.close();
    }
}

