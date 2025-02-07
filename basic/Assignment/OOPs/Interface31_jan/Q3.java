interface Flyable {
    void method1();
}

interface Swimmable {
    void method2();
}

class C implements Flyable, Swimmable {
    public void method1() {
        System.out.println("method1");
    }
    public void method2() {
        System.out.println("method2");
    }
}
public class Q3 {
    public static void main(String[] args) {
        C c = new C();
        c.method1();
        c.method2();
    }
}
