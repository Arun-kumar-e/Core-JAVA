interface A {
    void method1();
}

interface B extends A {
    void method2(int a);
}

interface C extends B {
    int method3();
}

interface D extends C {
    int method4(int a);
}

class E implements D {
    public void method1() {
        System.out.println("method1");
    }
    public void method2(int a) {
        System.out.println("method2 " + a);
    }
    public int method3() {
        System.out.println("method3 ");
        return 0;
    }
    public int method4(int a) {
        System.out.println("method4 " + a);
        return 0;
    }
}

public class Q2 {
    public static void main(String[] args) {
        E e = new E();
        e.method1();
        e.method2(1);
        e.method3();
        e.method4(1);
    }
}
