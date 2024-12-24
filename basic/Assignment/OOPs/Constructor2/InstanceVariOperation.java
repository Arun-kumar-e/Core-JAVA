import java.util.Scanner;

public class InstanceVariOperation {
    
    public static void main(String[] args) {

        UsInput obj = new UsInput();
        obj.inputt();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}

class UsInput{
    int num1;
    int num2;

    void inputt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        num1 = a;
        num2 = b;

        sc.close();
    }
    void add(){
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
    }

    void sub(){
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
    }

    void mul(){
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
    }

    void div(){ 
        System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
    }

}