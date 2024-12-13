import java.util.Scanner;
public class Ques5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // check if person eligible or not
        System.out.print("Enter the Char: ");
        char c = sc.next().charAt(0);

        switch (c) {
            case 'v':
                System.out.println("eligible");
                break;
            default:
                System.out.println("not eligible");
                break;
        }

        sc.close();
    }
}
