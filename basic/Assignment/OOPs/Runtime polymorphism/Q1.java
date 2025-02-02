public class Q1 {
    public static void main(String[] args) {
        B a = new B();
        a.m1();
    }
}

class A{
    void m1(){
        System.out.println("A's m1");
    }
}
class B extends A{
    void m1(){
        System.out.println("B's m1");
    }
}
