/**
 * 5) C program to enter student marks and find percentage and grade
A college has the following rules for the grading system:
5 marks (grade + %)
1. Below 30 – Fail
3. 40 to 30 – D
4. 40 to 60 – C
5. 60 to 80 – B 
6. Above 80 – A
 */
import java.util.Scanner;

public class Ques5 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter thr Marks of 5 Subjects out of 100 :");
        int sub1 = s.nextInt();
        int sub2 = s.nextInt();
        int sub3 = s.nextInt();
        int sub4 = s.nextInt();
        int sub5 = s.nextInt(); 

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        float precent = (total * 100) / 500;

        if (precent >= 80) {
            System.out.println("Grade A");
        } else if ( precent >= 60 && precent < 80) {
            System.out.println("Grade B");
        } else if ( precent >= 40 && precent < 60) {
            System.out.println("Grade C");
        } else if (precent < 40 && precent >= 30) {
            System.out.println("Grade D");
        } else { 
            System.out.println("Fail");
        }

        s.close();
    }
}
