public class DefaultConstructor {
    
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

    void add(){
        System.out.println("Addition is "+(a+b));
    }

}

class B extends A{

    B(){
        System.out.println("Default Constructor of B");
    }

}

class C extends A{
    
    C(){
        System.out.println("Default Constructor of C");
    }

}

class D extends A{

    D(){
        System.out.println("Default Constructor of D");
    }

}
