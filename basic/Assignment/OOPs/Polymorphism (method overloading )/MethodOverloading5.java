public class MethodOverloading5 {

    public static void main(int a , int b) {
        System.out.println("Integer value: " + (a + b));
    }

    public static void main(int a , Long b) {
        System.out.println("Sub " + (a - b));
    }

    public static void main(Long a , int b) {
        System.out.println("Multi " + (a * b));
    }

    public static void main() {
        int a = 10;
        int b = 20;
        System.out.println("Div " + (a / b));
    }

    public static void main(float a , int b) {
        float c = a%b;
        System.out.println("Mod " + c);
    }
    
    public static void main(String[] args) {
        
        MethodOverloading5 obj = new MethodOverloading5();
        obj.main(10, 20);
        obj.main(10, 20L);
        obj.main(10L, 20);
        obj.main();
        obj.main(10.5f, 20);

    }
}




