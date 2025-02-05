interface A{
    interface B{
        default int m2(int a){
            System.out.println("Interface A m2 method");
            return a;
        }
    }
    private int m1(){
        System.out.println("Interface A m1 method");
        return 0;
    }
    default void m2(){
        m1();
    }
}

class C implements A, A.B{

}   
public class Q3 {
    public static void main(String[] args) {
        C c = new C();
        c.m2();
        c.m2(10);
    }
}
