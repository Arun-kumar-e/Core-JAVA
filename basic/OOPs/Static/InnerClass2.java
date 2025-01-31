public class InnerClass2 {
    public static void main(String[] args) {
        A.B obj1 = new A().new B();
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
