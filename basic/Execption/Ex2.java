class Driver{

    void show(){
        throw new ArithmeticException("ArithmeticException");
    }
}
public class Ex2 {
     public static void main(String[] args) {
         Driver d = new Driver();

         try{
             d.show();
         }
         catch (ArithmeticException e) {
             System.out.println("ArithmeticException: " + e.getMessage());
         }
     }
}
