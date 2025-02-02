public class Q12 {
    public static void main(String[] args) {
        B obj = new B(10);
        obj.show();
        C obj1 = new C(20);
        obj1.show();
    }
}

class A {
    A(int a) {
        System.out.println("Class A");
    }
    void show() {
        System.out.println("Show");
    }
}

class B extends A {
    B(int a) {
        super(a);
        System.out.println("Class B");
    }
    void show() {
        super.show();
        System.out.println("Show B");
    }
}

class C extends A {
    C(int a) {
        super(a);
        System.out.println("Class C");
    }
    void show() {
        super.show();
        System.out.println("Show C");
    }
}