class A{
    void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    void display(){
        super.display();
        System.out.println("Class B");
    }
}
public class Q3 {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
