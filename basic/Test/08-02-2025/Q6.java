class A{
    void show(){
        System.out.println("A");
    }
}

class B extends A{
    void show(){
        System.out.println("B");
    }
}
public class Q6 {
    public static void main(String[] args) {
        A a = new B();
        a.show();
    }
}
