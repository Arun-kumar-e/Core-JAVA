interface A{
    default void show(){
        System.out.println("A");
    }
}

interface B{
    default void show(){
        System.out.println("B");
    }
}

class C implements A, B{
    public void show(){
        A.super.show();
        B.super.show();
    }
}
public class Q8 {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}
