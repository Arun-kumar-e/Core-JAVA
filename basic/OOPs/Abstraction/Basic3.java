public class Basic3 {
    
    public static void main(String[] args) {
        
        B b = new B();
        b.m1();

    }
}

abstract class A{
    A(){
        System.out.println("Constructor A");
    }

    abstract void m1();
}

class B extends A{ 

    void m1(){
        System.out.println("Method B");
    }
}
