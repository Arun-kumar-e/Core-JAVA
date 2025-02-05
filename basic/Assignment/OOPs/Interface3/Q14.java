class A {
    interface B {
        interface C {
            default void M1() {
                System.out.println("M1 in C");
            }
        }
    }
}

class D implements A.B.C {

}
public class Q14 {
    public static void main(String[] args) {
        D d = new D();
        d.M1();
    }
}
