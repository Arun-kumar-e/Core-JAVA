/**
 * 11) 
salalry :
holidays (1) =full salary 
2-5 =5% 
5-14 =10% 
15 =50% 
else =not salary 

output : 
name:
address: 
bank details: 
salary : 
alot :
 holidays 
 */
import java.util.Scanner;

public class Ques9 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the employ name: ");
        String name = s.nextLine();
        System.out.println(name);

        System.out.print("Address :");
        String address = s.nextLine();
        System.out.println(address);

        System.out.println("Bank no. : ");
        int m = s.nextInt();
        System.out.println(m);

        System.out.println("Enter the hoildays: ");
        int h = s.nextInt();

        System.out.println("Enter the Salary: ");
        float a = s.nextFloat();

        if(h==1) {
            System.out.print("Salary after dedaction" + a);

        } 
        else if (h>1 && h<6) {
            float l = a*0.005f;
            System.out.print("Salary after dedaction" + (a-l));

        }
         else if (h>5 && h<15) {
            float l = a*0.01f;
            System.out.print("Salary after dedaction" + (a-l));

        }
         else if (h>14 ){
            float l = a*0.05f;
            System.out.print("Salary after dedaction" + (a-l));

        }


        s.close();
    }
}
