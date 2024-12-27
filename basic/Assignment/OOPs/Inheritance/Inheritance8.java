public class Inheritance8 {
    
    public static void main(String[] args) {
        
        B b = new B();
        b.m5();
        b.m4();
        b.m2();
    }
}

class A{

    void m1(){
        System.out.println("A m1");
    }

    void m2(){
        m1();
    }

}

class B extends A{

    void m3(){
        System.out.println("B m3");
    }

    void m4(){
        m3();
    }

    void m5(){
        A a = new A();
        a.m2();
    }
}
