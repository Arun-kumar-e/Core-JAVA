class A{
    static int i = 10;
    int j = 20;

    public void method1(){
        i++;
        j++;
    }

    public void method2(){
        System.out.println("Static i = " + i + " Non-static j = " + j);
    }
}
public class Q12 {
    public static void main(String[] args) {
        A a = new A();
        a.method2();
        a.method2();
        a.method2();
       
    }
}
