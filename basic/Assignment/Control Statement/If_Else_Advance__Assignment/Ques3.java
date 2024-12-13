/**
 3)Check whether the trainge , square , reactanlge (area & volume)
->input area /volume 
 area 
 traingle square rectangle 
 square 
 Area of square
 */

 
import java.util.Scanner;

public class Ques3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("What you want to calculate (Area/Volume)");

        String a = sc.next();

        if (a.equals("area")) {

            System.out.println("Enter shape you want to calculate the area (Triangle/rectangle/square)");

            String s = sc.next();
            if (s.equals("triangle")) {
                System.out.println("Area of triangle ");
            } 
            else if (s.equals("rectangle")) {
                System.out.println("Area of rectangle ");
            }
             else if (s.equals("square")) {
                System.out.println("Area of square ");
            }
             else {
                System.out.println("Invalid input");
            }

        } else if (a.equals("volume")) {

            System.out.println("Enter shape you want to calculate the Volume (Triangle/rectangle/square)");

            String s = sc.next();
            if (s.equals("triangle")) {
                System.out.println("Volume of triangle ");
            }
             else if (s.equals("rectangle")) {
                System.out.println("Volume of rectangle ");
            }
             else if (s.equals("square")) {
                System.out.println("Volume of square ");
            }
             else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
