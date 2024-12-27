public class Inheritance9 {
    
    public static void main(String[] args) {
        
        D d = new D();
        d.m1();
        d.m2();
        d.m3();
        d.m4();

    }
}

class A{

    void m1(){
        System.out.println("A m1");
    }

}

class B extends A{

    void m2(){
        System.out.println("B m2");
    }
}

class C extends B{

    void m3(){
        System.out.println("C m3");
    }
}

class D extends C{

    void m4(){
        System.out.println("D m4");
    }
}
