import java.util.Scanner;

class maths{

    Scanner sc=new Scanner(System.in);
    int add(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        return c;
    }

    int sub(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a-b;
        return c;
    }

    int div(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a/b;
        return c;
    }

    int mul(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        return c;
    }

}

class EvenOrNot{

    Scanner sc=new Scanner(System.in);
    String print(){
        int a=sc.nextInt();
        if(a%2==0){
            return "Even";
        }
        else{
            return "Not Even";
        }
    }
}

class OddOrNot{
    Scanner sc=new Scanner(System.in);

    String print(){
        int a=sc.nextInt();
        if(a%2==0){
            return "Odd";
        }
        else{
            return "Not Odd";
        }
    }

}


public class Operaton {

    public static void main(String[] args) {
        
        maths m=new maths();
        System.out.println("Addition is "+m.add());
        System.out.println("Subtraction is "+m.sub());
        System.out.println("Division is "+m.div());
        System.out.println("Multiplication is "+m.mul());
        
        EvenOrNot e=new EvenOrNot();
        System.out.println(e.print());
        OddOrNot o=new OddOrNot();
        System.out.println(o.print());
        
    }
}
