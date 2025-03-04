import java.util.Scanner;

class LowQuantityException extends Exception{
    public LowQuantityException(String message){
        super(message);
    }
}
public class Ex4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Quantity: ");
        int num1 = sc.nextInt();

        try{

            if(num1 > 500){
               System.out.println("Quantity: " + num1);
            }
            else{
                throw new LowQuantityException("Quantity is less than 500");
            }
        }
        catch(LowQuantityException e){
            System.out.println("LowQuantityException: " + e.getMessage());
            System.out.println("Low Quantity");
        }

        sc.close();
    }
}
