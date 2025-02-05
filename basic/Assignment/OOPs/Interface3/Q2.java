interface A{
    default int m1(){
            System.out.println("Interface A m1 method");
            return 0;
        }
        interface B{
            default int m2(){
                System.out.println("Interface B m1 method");
                return 0;
            }
        }
}

class C implements A, A.B{
}
public class Q2 {
 
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m2();
    }
}
