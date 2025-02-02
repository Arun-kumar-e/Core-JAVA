public class Q5 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();       
        obj = new C();
        obj.show();
    }
}

class A {
    void show(){
        System.out.println("Class A");
    }
}

class B extends A {
    void show(){
        System.out.println("Class B");
    }
}

class C extends A {
    void show(){
        System.out.println("Class C");
    }
}
