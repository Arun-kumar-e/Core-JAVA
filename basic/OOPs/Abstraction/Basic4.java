public class Basic4 {
    
    public static void main(String[] args) {
        
        // A a = new A();

    }
}

abstract class A{
    abstract void m1();
}

class B extends A{
   
    void m1(){
        System.out.println("Abstract Method");
    }
}
