/**
2)C program to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit
celsius 
f---->c 
fahrenheit
c---f 
**/ 
import java.util.Scanner;
public class Ques2 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Temperature: ");
        float t = s.nextFloat();

        System.out.println("Enter the Temperature Unit: ");
        String unit = s.next();

        if (unit.equals("celsius")) {
            float f = (t * 9 / 5) + 32;
            System.out.println(t + " Celsius = " + f + " Fahrenheit");
        } else if (unit.equals("fahrenheit")) {
            float c = (t - 32) * 5 / 9;
            System.out.println(t + " Fahrenheit = " + c + " Celsius");
        }else {
            System.out.println("Invalid Unit");
        }

        s.close();
    }
}
