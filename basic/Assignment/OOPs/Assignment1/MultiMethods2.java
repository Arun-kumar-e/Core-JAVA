class ClasA{
    void Methods1(){
        System.out.println("class AMethods1() is called.");
    }
}
class ClasB{
    void bMethod1(){
        System.out.println("class B Methods1() is called.");
    }
    void bMethod2(){
        System.out.println("class B Methods2() is called.");
    }
}
class ClasC{
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
class ClasD{
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

        ClasA a = new ClasA();
        a.Methods1();
        
        ClasB b = new ClasB();
        b.bMethod1();
        b.bMethod2();
        
        ClasC c = new ClasC();
        c.cMethod1();
        c.cMethod2();
        c.cMethod3();
        
        ClasD d = new ClasD();
        d.dMethod1();
        d.dMethod2();
        d.dMethod3();
        d.dMethod4();

    }
}
