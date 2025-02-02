public class Q2 {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();
    }
}

class A {
    protected void m1() {
        System.out.println("Class A , protected Method");
    }
}

class B extends A {
    protected void m2() {
        System.out.println("Class B , protected Method");
    }
}
