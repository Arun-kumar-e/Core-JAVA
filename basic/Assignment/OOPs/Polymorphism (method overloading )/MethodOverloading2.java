public class MethodOverloading2 {
    
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show(10, 20);
        obj.show(10, 20L);
        obj.show(10L, 20);
        obj.show();
        obj.show(10.5f, 20);

    }
}

class A{
    void show(int a , int b){
        System.out.println("Add " + (a + b));
    }

    void show(int a , Long b){
        System.out.println("Sub " + (a - b));
    }

    void show(Long a , int b){
        System.out.println("Multi " + (a * b));
    }

    void show(){
        int a = 10;
        int b = 20;
        System.out.println("Div " + (a / b));
    }

    void show(float a , int b){
        float c = a%b;
        System.out.println("Mod " + c);
    }

}
