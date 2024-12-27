// Chaining can only be done in same class
public class ConstructorChaining {
    
    public static void main(String[] args) {
        
        new A();

    }
}

class A{
    A(){
        this(233);
        System.out.println("Default Constructor");
    }
    A(int a){
        this("Hello");
        System.out.println("int "+ a);
    }

    A(Float a){
        
        System.out.println("Float "+ a);
    }

    A(String a){
        new A(155.44f);
        System.out.println("String "+ a);
    }
}
