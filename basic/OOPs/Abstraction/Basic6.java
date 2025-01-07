public class Basic6 {   
    public static void main(String[] args) {       
        B b = new B();
        b.m1();
        b.m2();
    }
}
abstract class A {
    abstract void m1();
    void m2() {
        System.out.println("Non-Abstract Method");
    }
}   
class B extends A {
    void m1(){
        System.out.println("Method B");
    }
}
