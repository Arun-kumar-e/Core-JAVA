class A{
    static class B{
        void m1(){
            System.out.println("Static Class");
        }
    }
}
public class Q1{
    public static void main(String[] args) {
        A.B obj = new A.B();
        obj.m1();        
    }
}