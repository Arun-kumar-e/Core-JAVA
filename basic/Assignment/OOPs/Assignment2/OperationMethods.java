class Operaation{
    void add(int a , int b){
        int c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }

    void sub(int a , int b){
        int c = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is " + c);
    }

    void mul(int a , int b){
        int c = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + c);
    }

    void div(int a , int b){ 
        int c = a / b;
        System.out.println("Division of " + a + " and " + b + " is " + c);
    }
}

class EvenNo{
    void even(int e){
        if(e%2==0){
            System.out.println(e+" is even number.");
        }else{
            System.out.println(e+" is not even number.");
        }
    }
}


class oddNo{
    void odd(int o){
        if(o%2!=0){
            System.out.println(o+" is odd number.");
        }else{
            System.out.println(o+" is not odd number.");
        }
    }
}

public class OperationMethods {
    
    public static void main(String[] args) {
        
        Operaation O = new Operaation();
        O.add(10, 20);
        O.sub(10, 20);
        O.mul(10, 20);
        O.div(10, 20);

        EvenNo E = new EvenNo();
        E.even(10);

        oddNo D = new oddNo();
        D.odd(10);
    }
}
