public class Q2 {
    
    public static void main(String[] args) {
        
        new A(10);
        new A();
    }
}

class A{
    A(int a){
        System.out.println(a);
    }
    A(){
        System.out.println("default ");
    }
}
