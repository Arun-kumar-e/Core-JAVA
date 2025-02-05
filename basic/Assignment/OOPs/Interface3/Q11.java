class A{
    interface B{
        private void M1(){
            System.out.println("M1 in B");
        }
        default void M2(){
            M1();
        }
    }

    interface C{
        private void M3(){
            System.out.println("M3 in C");
        }
        default void M4(){
            M3();
        }
    }
}

class D implements A.B, A.C{

}
public class Q11 {
    public static void main(String[] args) {
        D d = new D();
        d.M2();
        d.M4();
    }
}
