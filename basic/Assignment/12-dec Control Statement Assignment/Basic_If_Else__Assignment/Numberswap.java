import java.util.Scanner;

public class Numberswap {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        
        System.out.println("Number without swap " + "a = "+ a + "\n" + "b = " + b );


        System.out.println("Want to use Third number or not (y/n)");
        char ch = s.next().charAt(0);
        
        if(ch == 'n') {

            //number Swap without third numbe
            System.out.print("Number swap without third number: ");
              a = a+b;
              b = a-b;
              a = b-a;

            System.out.println("a = "+ a + "\n" + "b = " + b );
           }

        else{
           // Number swap with third number
            System.out.print("Number with third number: ");

            int c ;

            c = a;
            a = b;
            b = c;

            System.out.println("a = "+ a + "\n" + "b = " + b );
        }

        s.close();
    }
}
