public class Static1 {
    public static void main(String[] args) {
        new A();
        new A();           
    }
}
class A{
    static int a = 10; // static variable or class variable
    A(){
        a++;
        System.out.println(a);
    }
}