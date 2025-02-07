abstract class A{
    class B{
        void M1(){
            System.out.println("Inner Class Method");
        }
    }
}

class C extends A{

}
public class Q5 {
    public static void main(String[] args) {
        C c = new C();
        A.B b = c.new B();
        b.M1();
    }
}
