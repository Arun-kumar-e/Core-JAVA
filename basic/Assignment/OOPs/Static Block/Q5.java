interface A{
    default String m1(String s){
        return s;
    }

    static String m2(String a){
        return a;
    }

    default String m3(String b){
        return b;

    }
}

class B implements A{
    
}
public class Q5 {
    public static void main(String[] args) {
        B b =new B();
        System.out.println(b.m1("Default Method"));
        System.out.println(A.m2("Static Method"));
        System.out.println(b.m3("Private Method"));
    }
}
