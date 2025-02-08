class A{
    static int i = 0;
    A(){
        i++;
    }
    static int get(){
        return i;
    }
}
public class Q2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        System.out.println(A.get());
    }
}
