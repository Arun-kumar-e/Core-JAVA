import java.util.Scanner;

public class Gender {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        char ch = s.next().charAt(0);

        if(ch == 'm') {
            System.out.println("Male");
        } else if (ch == 'f') {
            System.out.println("Female");
        } else {
            System.out.println("Invalid input");
        }

        s.close();
    }
}
