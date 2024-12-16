import java.util.Scanner;

public class F17 {
    
    public static void main(String[] args) {
        
        System.out.println("Check Armstrong number or not");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check armstrong number or not");
        int num = sc.nextInt();

        int temp = num;
        
        int s = 0 , r = 0 ;
        while(num > 0) {
            r = num % 10;
            s = s + r * r * r;
            num = num / 10;
        }
        if(s == temp) {
            System.out.println("Armstrong Number");
        } else {    
            System.out.println("Not Armstrong Number");
        }

         
        System.out.println("Check pallindrome number or not");

        System.out.println("Enter the number to check pallindrome number or not");
        int n = sc.nextInt();

        int temp1 = n;
        int s1 = 0 , r1 = 0 ;
        while(n > 0) {
            r1 = n % 10;
            s1 = s1 * 10 + r1;
            n = n / 10;
        }
        if(temp1 == s1) {
            System.out.println("Pallindrome Number");
        } else {    
            System.out.println("Not Pallindrome Number");
        }


        System.out.println("Reverse the number");

        System.out.println("Enter the number to reverse");  

        int num1 = sc.nextInt();
        int r2 = 0;
        while(num1 > 0) {
            int rem = num1 % 10;
            r2 = r2 * 10 + rem;
            num1 = num1 / 10;
        }
        System.out.println("reverse number is " + r2);

        


        sc.close();
    }
}
