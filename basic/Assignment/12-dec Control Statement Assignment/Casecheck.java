import java.util.Scanner;

public class Casecheck {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char a = s.next().charAt(0);

        if (a>='A' && a<='Z') {
            System.out.println("Uppercase");
        } else if (a>='a' && a<='z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Invalid input");    
        }

        s.close();
    }
}
