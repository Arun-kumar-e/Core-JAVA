public class Q9 {
    public static void main(String[] args) {
        A a = new A();
        a.finalMethod();
        a.method();
        
    }
}

final class A {
    final int finalVar = 10;
    int Var = 10;

    final void finalMethod() {
        System.out.println("Fnal Method");
        // finalVar++;
        System.out.println(Var++); 
    }

    void method() {
        // finalVar++;
        System.out.println(Var++); 
    }
}
