import java.util.Scanner;

public class CheckVorC {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the Character: ");
    char a = s.next().charAt(0);

    if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
        System.out.println("Vowel");
    } else {
        System.out.println("Consonant");
    }
    
     s.close();
    }
}
