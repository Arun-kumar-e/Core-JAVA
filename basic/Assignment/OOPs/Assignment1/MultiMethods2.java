class A{
    void Methods1(){
        System.out.println("class AMethods1() is called.");
    }
}
class B{
    void bMethod1(){
        System.out.println("class B Methods1() is called.");
    }
    void bMethod2(){
        System.out.println("class B Methods2() is called.");
    }
}
class C{
    void cMethod1(){
        System.out.println("class C Methods1() is called.");
    }
    void cMethod2(){
        System.out.println("class C Methods2() is called.");
    }
    void cMethod3(){
        System.out.println("class C Methods3() is called.");
    }
}
class D{
    void dMethod1(){
        System.out.println("class D Methods1() is called.");
    }
    void dMethod2(){
        System.out.println("class D Methods2() is called.");
    }
    void dMethod3(){
        System.out.println("class D Methods3() is called.");
    }
    void dMethod4(){
        System.out.println("class D Methods4() is called.");
    }
}


public class MultiMethods2 {
    
    public static void main(String[] args) {

        A a = new A();
        a.Methods1();
        
        B b = new B();
        b.bMethod1();
        b.bMethod2();
        
        C c = new C();
        c.cMethod1();
        c.cMethod2();
        c.cMethod3();
        
        D d = new D();
        d.dMethod1();
        d.dMethod2();
        d.dMethod3();
        d.dMethod4();

    }
}
