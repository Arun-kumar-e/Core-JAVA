class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Ex5 {
    
    void show() throws MyException {
        throw new MyException("MyException");
    }

    void result() throws MyException {
        show();
    }
    public static void main(String[] args) {
        
        Ex5 e = new Ex5();

        try{
            e.result();
        }
        catch (MyException ex) {
            System.out.println("MyException: " + ex.getMessage());
        }

        finally {
            System.out.println("Finally block");
        }

    }
}
