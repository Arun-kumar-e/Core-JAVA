public class Q5 {
    
    public static void main(String[] args) {
        

        C c = new D();  
        c.method1();     
        c.method2();    
        c.method3(); 
    }
}

class A {

    void method1() {
        System.out.println("Method 1 Class A");
    }

}

class B extends A {

    void method2(){
        System.out.println("Method 2 Class B");
    }
}

class C extends B {

    void method3(){
        System.out.println("Method 3 Class C");
    }

}

class D extends C {
    
    void method4(){
        System.out.println("Method 4 Class D");
    }

}

