import java.util.Scanner;

public class FiveMaxNo {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        
        if (a>b && a>c && a>d && a>e) {
            System.out.println(a+" is greater than "+b+", "+c+", "+d+" and "+e);
        } else if (b>a && b>c && b>d && b>e) {
            System.out.println(b+" is greater than "+a+", "+c+", "+d+" and "+e);
        } else if (c>a && c>b && c>d && c>e) {
            System.out.println(c+" is greater than "+a+", "+b+", "+d+" and "+e);
        } else if (d>a && d>b && d>c && d>e) {
            System.out.println(d+" is greater than "+a+", "+b+", "+c+" and "+e);
        } else if (e>a && e>b && e>c && e>d) {
            System.out.println(e+" is greater than "+a+", "+b+", "+c+" and "+d);
        } else {
            System.out.println("All numbers are equal.");
        }

        s.close();
    }
}
