public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj1 = obj.new B();
        obj1.display(); 
        
        
    }
}
class A{
    class B{
        void display(){
            System.out.println("Inner class Method");
        }   
    }
}
