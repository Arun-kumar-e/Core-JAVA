class A{
    interface B{
        default int M1(int a){
            System.out.println("M1 in B " + a);
            return 0;
        }
    }
}

class C extends A implements A.B{
   }

public class Q7 {
    public static void main(String[] args) {
        C c = new C();
        c.M1(10);
    }
}
