/*
 * a=armstrong number 
p =prime number 
e =even 
o =odd 
f =factorial 
r =reverse 
l =fibonacci 
t =perfect number 
n =neon number 
w =leap year 
s =swap one way 
v =vowel and consonant 
 */
import java.util.Scanner;

public class Ques7 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Character: ");
        char c = sc.next().charAt(0);

        switch (c) {
            case 'a':
                System.out.println("Armstrong Number");
                int armnum = sc.nextInt();
                int temp = armnum;
                float s = 0 , r = 0 ;
                while(armnum > 0) {
                    r = armnum % 10;
                    s = s + r * r * r;
                    armnum = armnum / 10;
                }
                if(s == temp) {
                    System.out.println("Armstrong Number");
                } else {
                    System.out.println("Not Armstrong Number");
                }
                break;
            case 'p':
                System.out.println("Prime Number");
                int prime = sc.nextInt();
                int count = 0;
                for(int i = 1; i <= prime; i++) {
                    if(prime % i == 0) {
                        count++;
                    }
                }
                if(count == 2) {
                    System.out.println("Prime Number");
                } else {
                    System.out.println("Not Prime Number");
                }
                break;
            
            case 'e':
                System.out.println("Even Number");
                int even = sc.nextInt();
                if(even % 2 == 0) {
                    System.out.println("Even Number");
                } else {
                    System.out.println("Not Even Number");
                }
                break;
            
            case 'o':
                System.out.println("Odd Number");
                int odd = sc.nextInt();
                if(odd % 2 != 0) {
                    System.out.println("Odd Number");
                } else {
                    System.out.println("Not Odd Number");
                }
                break;

            case 'f':
                System.out.println("Factorial Number");
                int fact = sc.nextInt();
                int factnum = 1;
                for(int i = 1; i <= fact; i++) {
                    factnum = factnum * i;
                }
                System.out.println(factnum);
                break;

            case 'r':
                System.out.println("Reverse Number");
                int rev = sc.nextInt();
                int revnum = 0;
                while(rev > 0) {
                    int rem = rev % 10;
                    revnum = revnum * 10 + rem;
                    rev = rev / 10;
                }
                System.out.println(revnum);
                break;

            case 'l':
                System.out.println("Fibonacci Number");
                int fib = sc.nextInt();
                int a = 0, b = 1, d = 0;
                for(int i = 1; i <= fib; i++) {
                    d = a + b;
                    System.out.println(d);
                    a = b;
                    b = d;
                }
                
                break;
            
            case 't':
                System.out.println("Perfect Number");
                int per = sc.nextInt();
                int sum = 0;
                for(int i = 1; i < per; i++) {
                    if(per % i == 0) {
                        sum = sum + i;
                    }
                }
                if(sum == per) {
                    System.out.println("Perfect Number");
                } else {
                    System.out.println("Not Perfect Number");
                }
                break;

            case 'n':
                System.out.println("Neon Number");
                int ne = sc.nextInt();
                int sq = ne * ne;
                int sum1 = 0;
                while(sq > 0) {
                    int rem = sq % 10;
                    sum1 = sum1 + rem;
                    sq = sq / 10;
                }
                if(sum1 == ne) {
                    System.out.println("Neon Number");
                } else {
                    System.out.println("Not Neon Number");
                }
                break;

            case 'w':
                 System.out.println("leap year");
                 int year = sc.nextInt();
                 if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                     System.out.println("leap year");
                 } else {
                     System.out.println("Not leap year");
                 }    
                 break;

            case 's':
                System.out.println("Swap Number");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                num1 = num1 + num2;
                num2 = num1 - num2;
                num1 = num1 - num2;
                System.out.println(num1 + " " + num2);
                break;  
                
            case 'v':
                System.out.println("Vowel and Consonant");
                char ch = sc.next().charAt(0);  
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }

        sc.close();
    }
}
