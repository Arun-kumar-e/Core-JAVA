public class GandSinMultilevelInheritance {
    
    public static void main(String[] args) {
        
        C c = new C();
        c.set("Class A");
        c.set1("Class B");
        c.set2("Class C");

        c.display1();
        c.display2();
        c.display3();
    }
}

class A{

    private String s;

    void set(String s){
        this.s =s;
    }

    String get(){
        return s;
    }

    void display1(){
        System.out.println(s);
    }
}

class B extends A{

    private String a;

    void set1(String a){
        this.a = a;
    }

    String get(){
        return a;
    }

    void display2(){
        System.out.println(a);
    }

}

class C extends B{

    private String b;

    void set2(String b){
        this.b = b;
    }

    String get(){
        return b;
    }

    void display3(){
        System.out.println(b);
    }

}

