
class A{

    void Methods1(){
        System.out.println("Method 1");
    }

    void Methods2(){
        System.out.println("Method 2");
    }

}
public class MultiMethods {
    
    public static void main(String[] args) {
        
        A a = new A();
        a.Methods1();
        a.Methods2();
    }
}
