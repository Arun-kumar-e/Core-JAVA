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


        //Another String Compare
        String s2 = sc.next();
        String s3 = sc.next();

        if (s2.equals(s3)) {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
        sc.close();
    }
}
