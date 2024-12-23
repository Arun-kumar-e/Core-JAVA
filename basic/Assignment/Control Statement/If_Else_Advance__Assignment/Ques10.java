/*
 * 12)
electric city bill : 
4 unit 
40 
1- 10 = 10% 
11-20 =15% 
21-40 =30% 
50 =50% 

output : 
name:
unit :3 
amout 30 
discout : 10% 
total pay amount : 
 */
import java.util.Scanner;

public class Ques10 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = s.nextLine();
        System.out.println(name);

        System.out.print("Enter the unit use: ");
        int unit = s.nextInt();
        System.out.println();

        System.out.print("Enter the Amount: ");
        int amont = s.nextInt();
        System.out.println();
       
        System.out.print("Discount :");

        float Discount;
        if(unit > 0 && unit<11 ) {
            Discount = amont*0.1f;
            System.out.println(Discount);
            System.out.print("Toatal pay amount: "+(amont-Discount));
        } else if (unit >10 && unit <21){
            Discount = amont*0.15f;
            System.out.println(Discount);
            System.out.print("Toatal pay amount: "+(amont-Discount));
        } else if (unit>20 && unit <41) {
            Discount = amont*0.3f;
            System.out.println(Discount);
            System.out.print("Toatal pay amount: "+(amont-Discount));
        } else if (unit>40) {
            Discount = amont*0.5f;
            System.out.println(Discount);
            System.out.print("Toatal pay amount: "+(amont-Discount));
        } 

        s.close();
    }
    
}
