import java.util.Scanner;

public class PlacementChecj {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of students placed in CSE: ");
        int cse = sc.nextInt();

        System.out.print("Enter the no of students placed in ECE: ");
        int ece = sc.nextInt();

        System.out.print("Enter the no of students placed in MECH: ");
        int mech = sc.nextInt();

        if (cse >= ece && cse >= mech) {
            System.out.println("Highest placement is in CSE");
        } else if (ece >= cse && ece >= mech) {
            System.out.println("Highest placement is in ECE");
        } else if (mech >= cse && mech >= ece) {
            System.out.println("Highest placement is in MECH");
        } else if (cse == ece && cse == mech && ece == mech) {
            System.out.println("None of the department has got the highest placement");
        } else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}
