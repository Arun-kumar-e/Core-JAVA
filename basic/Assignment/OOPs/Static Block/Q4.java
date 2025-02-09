class A{
    abstract class B{
        abstract void m1();
    }

    static class C{
        void add(int a ,int b){
            System.out.println(a+b);
        }
    }

    interface D{
        String m2();
    }

    class E {
        int addd(int a ,int b){
            return a+b;
        }
    }
}

class Child extends A{
    class F extends B{
        void m1(){
            System.out.println("Static Class");
        }
    }

    class G implements D{
        public String m2(){
            return "Static Method";
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        Child obj = new Child();
        Child.F f = obj.new F();
        f.m1();

        A.C c = new A.C();
        c.add(2,3);

        Child.G g = obj.new G();
        System.out.println(g.m2());

        A a = new A();
        A.E e = a.new E();
        System.out.println(e.addd(10,3));
    }
}
