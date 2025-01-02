public class HybridInheritance {
    
    public static void main(String[] args) {
        
        D d = new D();
        d.displayD();
        d.displayC();
        d.displayB();
        d.displayA();

    }
}

class A{

    void displayA(){
        System.out.println("Class A");
    }

}

class B extends A{

    void displayB(){
        System.out.println("Class B");
    }

}

class C extends B{

    void displayC(){
        System.out.println("Class C");
    }

}

class D extends A , B, C{

    void displayD(){
        System.out.println("Class D");
    }

}


