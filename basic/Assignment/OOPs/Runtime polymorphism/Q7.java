public class Q7 {
    public static void main(String[] args) {
        B obj = new B();
        obj.m1(10);
        C obj1 = new C();
        obj1.m1(20);
    }
}

class A {
    void m1(int a) {
        System.out.println("Class A: " + a);
    }
}

class B extends A {
    void m1(int a) {
        System.out.println("Class B: " + a);
    }
}

class C extends A {
    void m1(int a) {
        System.out.println("Class C: " + a);
    }
}