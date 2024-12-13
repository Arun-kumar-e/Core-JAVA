/*
 * 13) 
retailer 
customer 
retailer : 
1-15 peices =15% 
16-30 =30% 
31-50 =50% 

output : 
reailer name :asish kumar 
peicies : 30 
discount : 

customer  : 
1000 to 2000 -10% 
100-1000 -5% 
2000--3000 =15% 
3000< 30% 
sout("---------------------");
output : 
customer name : 
contact number : 
payment : 
discout : 
total payment 
 */

 
import java.util.Scanner;

public class Ques11 {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your role (retailer/customer)");

        String r = sc.nextLine();

        if (r.equals("retailer")) {

            System.out.print("enter the name of retailer: ");
            String name = sc.nextLine();
            System.out.println();
            
            System.out.print("Enter the number of peices: ");
            int no = sc.nextInt();
            System.out.println();

            System.out.print("Discount: ");
            if(no>0 && no<15) {
                System.out.println("15%");
            } else if(no>15 && no<31) {
                System.out.println("30%");
            } else if(no>30 && no<51) {
                System.out.println("50%");
            } else {
                System.out.println("60%");
            }
        }

        else if (r.equals("customer")) {

            System.out.print("enter the name of customer: ");
            String name = sc.nextLine();
            System.out.println();
            
            System.out.print("Enter the Contact Number: ");
            int no = sc.nextInt();
            System.out.println();

            System.out.print("Enter the payment: ");
            int pay = sc.nextInt();
            System.out.println();

            System.out.print("Discount: ");
            if(pay>1000 && pay<2000) {
                System.out.println("10%");
            } else if(pay>100 && pay<1000) {
                System.out.println("5%");
            } else if(pay>2000 && pay<3000) {
                System.out.println("15%");
            } else if (pay>3000 ) {
                System.out.println("30%");
            }else {
                System.out.println("Not match");
            }

        }

        sc.close();
    }
}
