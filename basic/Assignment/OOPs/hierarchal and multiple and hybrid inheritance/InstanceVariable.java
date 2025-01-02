public class InstanceVariable {
    
    public static void main(String[] args) {
        
        B b = new B();
        b.add();

        System.out.println();

        C c = new C();
        c.add();

        System.out.println();

        D d = new D();
        d.add();

    }
}

class A{

    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;

}

class B extends A{

    void add(){
        System.out.println("Instance variable a is "+a);
        System.out.println("Instance variable b is "+b);
        System.out.println("Sum of a and b is "+(a+b));

    }
}

class C extends A{

    void add(){
        System.out.println("Instance variable c is "+c);
        System.out.println("Instance variable d is "+d);
        System.out.println("Sum of c and d is "+(c+d));

    }
}

class D extends A{

    void add(){
        System.out.println("Instance variable a is "+a);
        System.out.println("Instance variable d is "+d);
        System.out.println("Sum of a and d is "+(a+d));

    }
}

