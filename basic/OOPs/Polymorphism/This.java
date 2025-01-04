public class This {
    
    public static void main(String[] args) {
        
        B obj = new B();
        obj.show();
    }
}
class A{

    String name = "A";
    // A(int a){
    //     System.out.println("A");
    // }
}

class B extends A{

    String name = "B";

    void show(){
        System.out.println(name);
        System.out.println(super.name);
    }

    // B(){
    //     this(10);
    //     System.out.println("B");
    // }
    
    //  B(int i) {
    //        super(i);
    //        System.out.println("B");
    // }
}

