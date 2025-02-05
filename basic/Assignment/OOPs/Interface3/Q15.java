interface A{
    abstract class B{
        void M1(){
            System.out.println("M1 in B");
        }
    }
}
class C extends A.B{
    
}
public class Q15 {
    public static void main(String[] args) {
        C c = new C();
        c.M1();
    }
}
