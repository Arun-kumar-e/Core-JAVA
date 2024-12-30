public class MultilevelInheritance {
    
    public static void main(String[] args) {
        
        D d = new D();
        d.display1();
        d.display2();
        d.display3();
        d.display4();
        
    }
}

class A{

    void display1(){
        System.out.println("Class A");
    }

}

class B extends A{

    void display2(){
        System.out.println("Class B");
    }

}

class C extends B{

    void display3(){
        System.out.println("Class C");
    }

}

class D extends C{

    void display4(){
        System.out.println("Class D");
    }

}