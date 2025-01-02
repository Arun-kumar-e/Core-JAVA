public class ProtectedInstanceVariabel {
    
    public static void main(String[] args){
        
        B obj = new B();
        obj.display();
    }
}

class A{

    protected int a = 10;

}

class B extends A{

    void display(){
        System.out.println("protected variable a is: "+a);
    }

}