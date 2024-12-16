import java.util.Scanner;

public class IncrementCalculation {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Salary: ");
        double s = sc.nextDouble();

        System.out.println("Enter the appraisal rating: ");
        float a = sc.nextFloat();

        double b = 0.0f;

        if (s>0 && 1<=a && a<=5 ) {
            if (a>=1 && a<=3) {
                b = s*0.1f;
                System.out.print("Increment is 10%\nNew salary is: " + (s+b));
            } else if (a>=3.1 && a<=5) {
                b = s*0.25;
                System.out.print("Increment is 25%\nNew salary is: " + (s+b));
            } else if (a>=4.1 && a<=5) {
                b = s*0.3;
                System.out.print("Increment is 30%\nNew salary is: " + (s+b));
            }
        } else{
            System.out.println("Invalid Input!");
        }

        sc.close();
    }
    
}
