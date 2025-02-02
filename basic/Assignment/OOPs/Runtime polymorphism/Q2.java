public class Q2 {
    
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

class A {

    void show() {
        System.out.println("Class A");
    }
}

class B extends A {

    void show() {
        super.show();
        System.out.println("Class B");
    }
}