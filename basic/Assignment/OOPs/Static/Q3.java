class A{
    class B{
        private void M1(){
            System.out.println("Inner Class Method");
        }

        void callDisplay(){
            M1();
        }
    }

    private void M2(){
        System.out.println("Outer Class Method");
    }

    void callDisplay(){
        M2();
    }
}
public class Q3 {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.callDisplay();
        a.callDisplay();
    }
}
