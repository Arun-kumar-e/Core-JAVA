class A {
    interface B {
        class C {
            void M1() {
                System.out.println("M1 in C");
            }
        }
    }
}

class D extends A.B.C {

}
public class Q13 {
    public static void main(String[] args) {
        D d = new D();
        d.M1();
    }
}
