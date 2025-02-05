interface A {
    void method1();
    default void method2(int a) {
        System.out.println("method2 " + a);
        method3();
        method4(a);
    }
    private int method3() {
        System.out.println("method3 ");
        return 0;
    }
    private int method4(int a) {
        System.out.println("method4 " + a);
        return 0;
    }
}

class B implements A {
    public void method1() {
        System.out.println("method1");
    }

}

public class Q3 {
    public static void main(String[] args) {
        B b = new B();
        b.method1();
        b.method2(1);
    }
}
