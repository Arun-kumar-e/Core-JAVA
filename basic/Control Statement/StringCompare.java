import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s1 = sc.nextLine();

        // string[variable].equals("word")  this is to compare string
        if (s1.equals("apple")) {
            System.out.println("A");
        }

        sc.close();
    }
}
