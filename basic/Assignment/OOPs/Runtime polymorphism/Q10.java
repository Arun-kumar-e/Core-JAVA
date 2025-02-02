public class Q10 {
    public static void main(String[] args) {
        new B(10, 20);
    }
}

class A{
    A(int a, int b){
        System.out.println("Class A: " + (a + b));
    }
}

class B extends A{
    B(int a , int b){
        super(a, b);
        System.out.println("Class B: " + (a + b + 20));
    }
}
