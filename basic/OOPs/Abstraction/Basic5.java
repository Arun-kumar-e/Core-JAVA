public class Basic5 {
    
    public static void main(String[] args) {
        
        A a = new B();
        a.m1();

    }
}

abstract class A {

    abstract void m1();
}

class B extends A {

    void m1() {
        System.out.println("Abstract Method");
    }
}
