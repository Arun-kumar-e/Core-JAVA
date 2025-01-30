public class Interface2 {    
    public static void main(String[] args) {
        
        B obj = new C();
        obj.show();
        
    }
}

interface A {
    void show();
}
interface B{
    default void show(){
        System.out.println("Show B");
    };    
}
class C implements A,B{
    public void show() {
        System.out.println("Show");
    }
}
