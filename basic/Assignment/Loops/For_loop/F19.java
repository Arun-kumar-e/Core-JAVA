import java.util.Scanner;

public class F19 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String(even or odd): ");
        String s = sc.nextLine();

        System.out.println("Enter the starting and end of range: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = 0;

        if (s.equals("even")) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    c++;
                }
            }       
            
            System.out.println("\n\nTotal number of even numbers: " + c);
        } else if (s.equals("odd")) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    c++;
                }
            }
            
            System.out.println("\n\nTotal number of odd numbers: " + c);
        } else {
            System.out.println("Invalid Input");
        }               
        
        sc.close();
    }
}
