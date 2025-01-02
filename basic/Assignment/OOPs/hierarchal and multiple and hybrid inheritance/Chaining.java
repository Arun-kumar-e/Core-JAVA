public class Chaining {
    
    public static void main(String[] args) {
        
        B b = new B();
        b.m6();

        System.out.println();

        C c = new C();
        c.m8();
        

        System.out.println();

        D d = new D();
        d.m9();
    }
}

class A{

    void m1(){
        System.out.println("Class A ");
    }

    void m2(){
        m1();
    }

    void m3(){
        m2();
    }

}

class B extends A{

    void m4(){
        m3();
    }

    void m5(){
        m4();
    }

    void m6(){
        m5();
    }

}

class C extends A{
    
    void m7(){
        m3();
    }

    void m8(){
        m7();
    }

    
}

class D extends A{
    
    void m9(){
        m3();
    }

   
}
