class A{
    static int x = 10;

    public A(){
       x++;
    }
}
public class Q9 {
    public static void main(String[] args) {
        new A();
        new A();
        new A();
        new A();
        System.out.println(A.x);
        
    }
}
