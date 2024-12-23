class A{
    A(){
        System.out.println("Constructor");
    }
    void show(){
        System.out.println("Method1");
    }

    void show1(){
        System.out.println("Method2");
    }
}
public class ConstructorBasic {
    
    public static void main(String[] args) {
        
        new A().show();
        System.out.println();
        new A().show1();
        System.out.println();
        A obj = new A();
        obj.show();
        obj.show1();
    }
}
