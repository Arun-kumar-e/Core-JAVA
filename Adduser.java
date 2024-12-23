import java.util.*;
public class Adduser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers for addition:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+c);

        sc.close();
    }
}
