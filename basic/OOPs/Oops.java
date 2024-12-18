import java.util.Scanner;


class A{
//method
    void show(int n , int m , char ch){
        System.out.println((n+m));
        System.out.println(ch);
    }
}

class B{

    void fname(){
        System.out.println("Arun ");
    }

    void sname(){
        System.out.println("Choudhary");
    }
}
public class Oops {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        //call method
        A obj = new A();
        int n = sc.nextInt();
        obj.show(n,n,'a');

        B b = new B();
        b.fname();
        b.sname();

        sc.close();
    }
}
