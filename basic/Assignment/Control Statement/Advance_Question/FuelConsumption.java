import java.util.*;
public class FuelConsumption {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no of liters to fill the tank: ");
        double li = sc.nextDouble(); 

        System.out.print("Enter the distance covered: ");
        double dis = sc.nextDouble();

        double a = (li/dis)*100;
        System.out.println("Liters/100KM: "+ a);

        li = li*0.264172;
        dis = dis*0.6214;
        double b = (dis/li);

        System.out.println("Miles/gallons: "+b);

        sc.close();
    }
}
