class A{
    abstract class B{
        void M1(){
            System.out.println("Inner Class Method");
        }
        abstract void M2();
    }
}
public class Q4 {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B(){
            void M2(){
                System.out.println("Abstract Method");
            }
        };
        b.M1();
        b.M2();
    }
}
