class A{
    static class B{
        String add(){
            return "Static Method";
        }
    }

    class C{
        String add(String s){
            return s;
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        A.B b = new A.B();
        System.out.println(b.add());
        A a = new A();
        A.C c = a.new C();
        System.out.println(c.add("Hello"));
    }
}
