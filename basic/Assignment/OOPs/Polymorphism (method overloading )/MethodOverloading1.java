public class MethodOverloading1 {

    public static void main(String[] args) {
        
        A obj = new A();
        obj.show(10, 20 , 30 , 40);
        obj.show(10, 20 , 5);
        obj.show(10, 20);
        obj.show();
        obj.show(20);

    }
}

class A{
    void show(int a , int b , int c , int d){
        System.out.println("Add " + (a + b + c + d));
    }

    void show(int a , int b , int c ){
        System.out.println("Sub " + (a - b - c));
    }

    void show( int a , int b){
        System.out.println("Multi " + (a * b));
    }

    void show(){
        int a = 10;
        int b = 20;
        System.out.println("Div " + (a / b));
    }

    void show( int b){
        int a = 10;
        float c = a%b;
        System.out.println("Mod " + c);
    }

}


