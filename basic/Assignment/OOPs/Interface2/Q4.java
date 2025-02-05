interface A {
    private int method1(){
        System.out.println("method1");
        return 0;
    }

    default void method2(){
        method1();
    }
}

interface B extends A {
    default int method3(int a){
        System.out.println("method3 ");
        method2();
        return 0;
    }
}

class C implements B {
    public void method4(){
        System.out.println("method4 " );
    }
}

class D extends C{
    public void method5(){
        System.out.println("method5");
    }
}

class E extends D{
    public void method6(){
        System.out.println("method6");
    }
}
public class Q4 {
    public static void main(String[] args) {
        E e = new E();
        e.method6();
        e.method5();
        e.method4();
        e.method3(1);
    }
}
