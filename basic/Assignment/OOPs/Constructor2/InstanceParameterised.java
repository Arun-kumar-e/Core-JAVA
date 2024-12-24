import java.util.Scanner;

public class InstanceParameterised {
    
    public static void main(String[] args) {
        
        UsInput obj = new UsInput(10, 5);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();

    }
}


class UsInput {
    int num1, num2;

    UsInput(int num1, int num2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        this.num1 = num1;
        this.num2 = num2;

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