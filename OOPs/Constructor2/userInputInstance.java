import java.util.*;
public class userInputInstance {
    
    public static void main(String[] args) {
        
        UserInput O = new UserInput();
        O.add();
        O.sub();
        O.mul();
        O.div();
    }
}

class UserInput{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    void add(){
        int c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }

    void sub(){
        int c = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is " + c);
    }

    void mul(){
        int c = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + c);
    }

    void div(){
        int c = a / b;
        System.out.println("Division of " + a + " and " + b + " is " + c);
    }
}

