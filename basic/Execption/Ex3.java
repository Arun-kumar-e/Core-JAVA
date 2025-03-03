public class Ex3 {

    void show() throws ArithmeticException{
        throw new ArithmeticException("ArithmeticException");
    }

    void display(){
        show();
    }

    void hello() throws ClassNotFoundException{
        throw new ClassNotFoundException("ClassNotFoundException");
    }
    public static void main(String[] args) {

        Ex3 e = new Ex3();

        try{
            e.display();
            e.hello();
        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: " + ex.getMessage());
        }
        catch (ClassNotFoundException j) {
            System.out.println("ClassNotFoundException: " );
        }
    }
}
