
class Meth{

    void Methods1(){
        System.out.println("Method 1");
    }

    void Methods2(){
        System.out.println("Method 2");
    }

}
public class MultiMethods {
    
    public static void main(String[] args) {
        
        Meth a = new Meth();
        a.Methods1();
        a.Methods2();
    }
}
