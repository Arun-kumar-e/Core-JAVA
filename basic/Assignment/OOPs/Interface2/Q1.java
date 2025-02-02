interface A {
    void method1();
    void method2(int a);
    int method3();
    int method4(int a);
}

class B implements A {
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

public class Q1 {
    public static void main(String[] args) {
        A a = new B();
        a.method1();
        a.method2(1);
        a.method3();
        a.method4(1);
    }
}