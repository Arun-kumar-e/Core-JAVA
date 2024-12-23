import java.util.Scanner;

public class D1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the car no.");
        int a = sc.nextInt();

        int count = 0 , sum =0;
        if (a>0) { 
            
        
        for (int i = a; i > 0; i = i/10) {
            int r = i%10;
               sum = sum + r;
               count++;
        }

        if (count == 4) {
            if (sum%3==0 || sum%5==0 || sum%7==0) {
                System.out.println("Lucky number");
            }
            else{
                System.out.println("It is not a lucky number");
            }
        } else {
            System.out.println("It is not a valid car number");
            
        }
    } else {
        System.out.println("It is not a valid car number");
    }

        sc.close();
    }
    
}

