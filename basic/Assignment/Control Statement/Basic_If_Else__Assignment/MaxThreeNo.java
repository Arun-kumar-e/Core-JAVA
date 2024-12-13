import java.util.Scanner;

public class MaxThreeNo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();        
        int c = s.nextInt();

        if (a>b && a>c) {
            System.out.println(a+" is greater than "+b+" and "+c);
        } else if (b>a && b>c) {
            System.out.println(b+ "is greater than "+a+" and "+c);
        } else {
            System.out.println(c+" is greater than "+a+" and "+b);
        }

        s.close();
    }
}
