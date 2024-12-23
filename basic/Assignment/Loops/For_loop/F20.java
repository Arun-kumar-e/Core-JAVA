import java.util.Scanner;

public class F20 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        System.out.print("Enter what you want to do: ");
        System.out.println("[neon , perect , primr , fibonacci, sumofdigit, countthedigit]");
        String s = sc.next();

        if (s.equals("neon")) {
            int ne = n;
            int sq = ne * ne;
            int sum1 = 0;
            while (sq > 0) {
                int rem = sq % 10;
                sum1 = sum1 + rem;
                sq = sq / 10;
            }
            if (sum1 == ne) {
                System.out.println("Neon Number");
            } else {
                System.out.println("Not Neon Number");
            }
        } else if (s.equals("perfect")) {
            int per = n;
            int sum = 0;
            for (int i = 1; i < per; i++) {
                if (per % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == per) {
                System.out.println("Perfect Number");
            } else {
                System.out.println("Not Perfect Number");
            }
        } else if (s.equals("prime")) {

            System.out.println("enter the string(one or more): ");
            String str = sc.next();

            if (str.equals("one")) {
                int p = n;
            int count = 0;
            for (int i = 1; i <= p; i++) {
                if (p % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime Number");
            }
        } 
        else if (str.equals("more")) {
            System.out.println("prime number between 1 to 100 are: ");
            int count = 0;
            for (int i = 1; i <=100 ; i++) {
                for(int j = 1; j <= 100; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
               } 
            }
         }
      } 
          else if (s.equals("countthedigit")) {
             int num = n;
             int count = 0;
             while (num > 0) {
                num = num / 10;
                count++;
            }
            System.out.println("Number of digits: " + count);
        }
           else if (s.equals("sumofdigit")) {
            int num = n;
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            System.out.println("Sum of digits: " + sum);
           }
           else if (s.equals("fibonacci")) {
            int num = n;

            System.out.println("what you want to print last or complete series(last or complete): ");

            String str = sc.next();
            if (str.equals("complete")) {
                System.out.println("Fibonacci Series: ");
            int a = 0, b = 1, c = 0;
            for (int i = 1; i <= num; i++) {
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        } else if (str.equals("last")) {
            int a = 0, b = 1, c = 0;
            for (int i = 1; i <= num; i++) {
                c = a + b;
                a = b;
                b = c;
        }
        System.out.println("Last number of fibonacci series: " + c);
           }
        }


        sc.close();
    }
}
