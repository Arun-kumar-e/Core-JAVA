public class MethodOverriding {
    
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
        System.out.println("B");
    }
}

