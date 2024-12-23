import java.util.*;
public class BillGenerater {
    
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought: ");
        int p = sc.nextInt();
        float price = p*100;

        System.out.print("Enter the no of puffs bought: ");
        int pu = sc.nextInt();
        price = price + (pu*20);

        System.out.print("Enter the no of cool drinks bought: ");
        int c = sc.nextInt();
        price = price + (c*10);


        System.out.println("Total price = " + price);
        System.out.println("ENJOY THE SHOW!!!");

        sc.close();
    }
}
