public class MethodOverloading7 {
    
    public static void main(String[] args) {
        
        A obj = new A();
        obj.display(10, 20.5f);
        obj.display(20.5f, 10);

    }
}

class A{

    void display(int a , float b){
        System.out.println("value: " + a + " " + b);
    }

    void display( float b , int a ){
        System.out.println("value: " + b + " " + a);
    }

}

