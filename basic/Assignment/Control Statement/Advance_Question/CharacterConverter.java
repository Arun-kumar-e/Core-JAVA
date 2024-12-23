import java.util.*;
public class CharacterConverter {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character (in capital): ");
        char ch = sc.next().charAt(0);
        int c = ch;

        System.out.println(ch +"-"+c);

        sc.close();

    }
}
