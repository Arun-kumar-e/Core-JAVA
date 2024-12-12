import java.util.Scanner;

public class Charmatch {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Char: ");
        char ch = s.next().charAt(0);

        if (ch == 'a') {
            System.out.println("Apple");
        } else if (ch == 'b') {
            System.out.println("Ball");
        } else if (ch == 'c') {
            System.out.println("Cat");
        } else{
            System.out.println("Not match");
        }

        s.close();
    }
}
