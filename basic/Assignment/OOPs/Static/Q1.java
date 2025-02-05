class A{
    class B{
        int M1(int a){
            System.out.println("M1 of B");
            return a;
        }

        B M2(){
            System.out.println("M2 of B");
            return this;
        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.M1(10);
        b.M2();
    }
}