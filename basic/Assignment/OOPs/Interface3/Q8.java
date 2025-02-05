class A{
    private void M1(){
        System.out.println("M1 in A");
    }

    void M4(){
        M1();
    }

    interface B{
        private int M2(int a){
            System.out.println("M2 in B " + a);
            return 0;
        }

        default void M3(){
            System.out.println("M3 in B");
            M2(22);
        }
    }
}

class C extends A implements A.B{
}
public class Q8 {
    public static void main(String[] args) {
        C c = new C();
        c.M3();
        c.M4();
    }
}
