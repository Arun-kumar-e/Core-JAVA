public class Q6 {
    
    public static void main(String[] args) {
        
        A a = new B();
        a.method1();

        System.out.println();
       
        A a1 = new C();
        a1.method1();
    }
}

class A{
    void method1(){
        System.out.println("Method 1");
    }
}

class B extends A{
    void method2(){
        System.out.println("Method 2");
    }
}

class C extends A{
    void method3(){
        System.out.println("Method 3");
    }
}

