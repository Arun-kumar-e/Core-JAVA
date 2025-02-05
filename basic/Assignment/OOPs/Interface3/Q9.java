interface A{
    void M1();
}
class B implements A{

    public void M1(){
        System.out.println("M1 in B");    
    }
    public void M2(){
        System.out.println("M2 in B");
    }
}

class C extends B{
    
}
public class Q9 {
    public static void main(String[] args) {
        C c = new C();
        c.M1();
        c.M2();
    }
}
