public class FinalMethod {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

class A{
    final void show(){
        System.out.println("A");
    }
}
class B extends A{

    // error because final method can't be overridden
    // void show(){
    //     System.out.println("B");
    // }

    
}