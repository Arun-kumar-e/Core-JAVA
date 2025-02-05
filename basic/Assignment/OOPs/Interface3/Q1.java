interface A{
    default int m1(int a){
            System.out.println("Interface A m1 method");
            return a;
        }
}

class B implements A{
}

public class Q1 {
    public static void main(String[] args) {
        B b = new B();
        b.m1(10);
    }
}