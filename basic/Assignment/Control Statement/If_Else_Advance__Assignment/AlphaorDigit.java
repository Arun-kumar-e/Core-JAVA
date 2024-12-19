/**
 * 4)java program to check whether a character is an alphabet or not
input =a =alpha 
digit :
3 =this is a digit
*/
import java.util.Scanner;

public class AlphaorDigit {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        char ch = s.next().charAt(0);

        if (ch>='a' && ch<='z') {
            System.out.println("Alphabet");
        } else if (ch>1) {
            System.out.println("Digit");
        } else {
            System.out.println("Invalid input");
        }

        s.close();
    }
}
