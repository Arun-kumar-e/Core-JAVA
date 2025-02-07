interface Printable{
    default void print(){
        System.out.println("Printable");
    }
}

class A implements Printable{
    public void print(){
        System.out.println("A");
    }
}
public class Q2 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}
