public class Q8 {
    public static void main(String[] args) {
        B obj = new B();
        obj.m1();
        C obj1 = new C();
        obj1.m1();
    }
}

class A {
    float m1() {
        System.out.println("Class A: " );
        return 0;
    }
}

class B extends A {
    int m1() {
        System.out.println("Class B: ");
        return 0;
    }
}

class C extends A {
    float m1() {
        System.out.println("Class C: ");
        return 0.0f;
    }
}