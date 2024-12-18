import java.util.*;
class Operaation{
    Scanner sc=new Scanner(System.in);
    void add(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }

    void sub(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is " + c);
    }

    void mul(){       
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + c);
    }

    void div(){ 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a / b;
        System.out.println("Division of " + a + " and " + b + " is " + c);
    }
}

class EvenNo{
    Scanner sc=new Scanner(System.in);
    void even(){
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is even number.");
        }else{
            System.out.println(a+" is not even number.");
        }
    }
}


class oddNo{
    Scanner sc=new Scanner(System.in);
    void odd(){
        int a = sc.nextInt();
        if(a%2!=0){
            System.out.println(a+" is odd number.");
        }else{
            System.out.println(a+" is not odd number.");
        }
    }
}
public class OperationM {
    
    public static void main(String[] args) {
       
        Operaation O = new Operaation();
        O.add();
        O.sub();
        O.mul();
        O.div();

        EvenNo E = new EvenNo();
        E.even();

        oddNo D = new oddNo();
        D.odd();
    }
}
