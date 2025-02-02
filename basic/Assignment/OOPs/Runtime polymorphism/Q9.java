import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();   
        B obj = new B();
        obj.m1(a, b);
        obj.m1();

        sc.close();
    }
}

class A {
    void m1(int a , int b) {
        System.out.println("Class A: " +( a + b) );
    }
}

class B extends A {
    void m1() {
        System.out.println("Class B: " );
    }
}
