public class VariablePArameter {

    public static void main(String[] args) {
        
        variOperation obj = new variOperation(10, 5);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        
    }
}

class variOperation{

    int num1, num2;

    variOperation(int a, int b){
        num1 = a;
        num2 = b;
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