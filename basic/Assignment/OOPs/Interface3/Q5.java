interface A{
    class B{
        B M1(){
            System.out.println("Covariant return type");
            return this;
        }
    }
}

class C extends A.B {
    
}


public class Q5 {
    public static void main(String[] args) {
        C c = new C();
        c.M1();
    }
}
