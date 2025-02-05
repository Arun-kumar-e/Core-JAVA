interface A{
    class B{
        void M1(){
            System.out.println("M1 in B");
        }
    }
    class C{
        void M2(){
            System.out.println("M2 in C");
        }
    }

    interface D{
        void M3();
    }
}

class E extends A.B  implements A.D {
    A.C c = new A.C();
    void M4(){
        c.M2();
    }
    public void M3(){
        System.out.println("M3 in E");
    }
}
public class Q10 {
    public static void main(String[] args) {
        E e = new E();
        e.M1();
        e.M3();
        e.M4();
    }
}
