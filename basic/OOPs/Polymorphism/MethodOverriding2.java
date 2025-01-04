public class MethodOverriding2 {
    
    public static void main(String[] args) {
        
        B obj = new B();
        obj.show();

    }
}

class A {

    void show() {
        System.out.println("A");
    }
}

class B extends A {

    void show() {
        super.show();
        System.out.println("B");
    }
}

