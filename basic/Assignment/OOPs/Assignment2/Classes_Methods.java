class A{
    String print(){
        String a = "Class A Method one";
        return a;
    }
}

class B{
    String print(){
        String a = "Class B Method one";
        return a;
    }

    String print1(){
        String a = "Class B Method two";
        return a;
    }
}

class C{
    String print(){
        String a = "Class C Method one";
        return a;
    }

    String print1(){
        String a = "Class C Method two";
        return a;
    }

    String print2(){
        String a = "Class C Method three";
        return a;
    }

}

class D{
    String print(){
        String a = "Class D Method one";
        return a;
    }    

    String print1(){    
        String a = "Class D Method two";
        return a;
    }

    String print2(){
        String a = "Class D Method three";
        return a;
    }

    String print3(){
        String a = "Class D Method four";
        return a;
    }
}
public class Classes_Methods {
    
    public static void main(String[] args) {
        
        A a = new A();
        System.out.println(a.print());  

        System.out.println();

        B b = new B();
        System.out.println(b.print());
        System.out.println(b.print1());

        System.out.println();
 
        C c = new C();
        System.out.println(c.print());
        System.out.println(c.print1());
        System.out.println(c.print2());

        System.out.println();
 
        D d = new D();
        System.out.println(d.print());
        System.out.println(d.print1());
        System.out.println(d.print2());
        System.out.println(d.print3());

    }
}
