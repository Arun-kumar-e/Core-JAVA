public class hierarchicalInheritance {

    public static void main(String[] args) {
        E e = new E();
        e.show4();
        e.show();

        System.out.println();

        D d = new D();
        d.show3("Class D");
        d.show();

        System.out.println();

        C c = new C();
        String s = c.show2("Class C");
        System.out.println(s);
        c.show();

        System.out.println();

        B b = new B();
        String s1 = b.show1();
        System.out.println(s1);
        b.show();
        
    }
}

class A{

    void show(){
        System.out.println("Class A");
    }
}

class B extends A{
    
    String show1(){
        String s = "Class B";
        return s;
    }

}

class C extends A{
    
    String show2(String c){
        return c;
    }

}

class D extends A{

    void show3(String d){
        System.out.println(d);
    }

}

class E extends A{

    A show4(){
        System.out.println("Class E");
        return this;
    }

}

