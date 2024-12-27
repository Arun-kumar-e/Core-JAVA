public class ReferenceVariable {
    
    public static void main(String[] args) {
        
        // here o is a reference variable of type A and the object is of type B
        A o = new B();
        o.show();
        // o.show1(); // This will give an error because the reference variable is of type A and the object is of type B
    }
}

class A{
    void show(){
        System.out.println("hello from clsss A");
    }
}

class B extends A{
    void show1(){
        System.out.println("hello from clsss B");
    }
}
