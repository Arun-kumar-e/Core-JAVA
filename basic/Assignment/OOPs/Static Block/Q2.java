class A{
    static class B{
        static B m1(){
            System.out.println("Static Class");
            return new B();
        }

        int add(int a , int b){
            return a+b;
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        A.B obj = new A.B();
        obj.m1();
        System.out.println(obj.add(2,3));
    }
}
