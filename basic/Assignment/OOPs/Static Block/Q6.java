class A{
    static String varia = "Static Variable";
    String varr = "Instance Variable";
    
    static void m1(){
        System.out.println(varia);
        A a = new A();
        System.out.println(a.varr);
    }
}
public class Q6 {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}
