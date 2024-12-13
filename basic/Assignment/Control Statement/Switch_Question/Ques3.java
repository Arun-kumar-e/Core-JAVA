/*3)
write a program to check whether the number is even or odd 
type1: 1 even number 
2 :odd number 

type2: e =>even number 
o=>odd number 
*/
import java.util.Scanner;

public class Ques3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println( num +"is a Even Number"  );
                
                break;
            case 1:
            System.out.println( num +"is a odd Number"  );
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        sc.close();

    }
}
