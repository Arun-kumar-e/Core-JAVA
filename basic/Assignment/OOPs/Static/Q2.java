class A{
    static int i = 1;

    A(){
        System.out.println("Called Constructor "+ i + " Times ");
        i++;
    }
}
public class Q2 {
    public static void main(String[] args) {
        new A();
        new A();
        new A();
        new A();
    }
}
