/**
  7)Write a java program to read the roll no, name,fnname and marks of three subjects and calculate the total, percentage and division.
Test Data :
Input the Roll Number of the student :784
student name : 
fname:
mname:
address:
contact:
Input the marks of Physics, Chemistry and Computer Application : 70 80 90
total: 
precentage : % 
division:
 */
import java.util.Scanner;

public class Ques7 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

       
        System.out.print("Test Date:");
        int date = s.nextInt(); 
        System.out.println(date);

        System.out.print("Input the Roll Number of the student: ");
        int rollno = s.nextInt();
        System.out.println(rollno);

        s.nextLine();

        System.out.print("Student name: ");
        String name = s.nextLine();
        System.out.println(name);

        System.out.print("Father name: ");
        String fname = s.nextLine();
        System.out.println(fname);

        System.out.print("Mother name: ");
        String Mname = s.nextLine();
        System.out.println(Mname);

        System.out.print("Address: ");
        String address = s.nextLine();
        System.out.println(address);

        System.out.print("Contant: ");
        int no = s.nextInt();
        System.out.println(no);

        System.out.print("Enter the marks of Physics, Chemistry and Computer Application: ");
        int a = s.nextInt();
        int b= s.nextInt();
        int c = s.nextInt();
        System.out.println(a+" " +b+" " +c);

        int total = a+b+c;

        System.out.println("Total : " + total);
        
        float precent = (total * 100) / 500;
        System.out.println("precent : " + precent);

        if (precent >= 80) {
            System.out.println("Division A");
        } else if ( precent >= 60 && precent < 80) {
            System.out.println("Division B");
        } else if ( precent >= 40 && precent < 60) {
            System.out.println("Division C");
        } else if (precent < 40 && precent >= 30) {
            System.out.println("Division D");
        } else { 
            System.out.println("Division Fail");
        }

        s.close();
        
    }
}
