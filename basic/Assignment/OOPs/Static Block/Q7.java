class A{
    A(){
        System.out.println("A");
    }
    static {
        System.out.println("Block of A");
    }
}

class B extends A{
    B(){
        System.out.println("B");
    }
    static {
        System.out.println("Block of B");
    }
    
}

class C extends B{
    C(){
        System.out.println("C");
    }
    static {
        System.out.println("Block of C");
    }   
}

class D extends C{
    D(){
        System.out.println("D");
    }   
    static {
        System.out.println("Block of D");
    }
}
public class Q7 {
    public static void main(String[] args) {
        D d = new D();
        
    }
}
