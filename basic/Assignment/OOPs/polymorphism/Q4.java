public class Q4 {
    
    public static void main(String[] args) {
        
        A a = new B();
        a.method1(10);
        a.method2();
        
    }
}

class A {
    int method1(int a) {
        System.out.println("Method 1");
        return a;
    }

    int method2() {
        int c = 100;
        System.out.println("Method 2");
        return c;
    }
}

class B extends A {
    void method3() {
        System.out.println("Method 3");
    }
}


