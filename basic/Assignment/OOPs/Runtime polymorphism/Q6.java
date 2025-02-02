public class Q6 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        C obj2 = new C();
        obj2.show();
    }
}

class A {
    void show(){
        System.out.println("Class A");
    }
}

class B extends A {
    void show(){
        super.show();
        System.out.println("Class B");
    }
}

class C extends A {
    void show(){
        super.show();
        System.out.println("Class C");
    }
}