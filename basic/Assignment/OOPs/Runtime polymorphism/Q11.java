public class Q11 {
    public static void main(String[] args) {
        C obj = new C(10, 20);
        obj.show();

    }
}

class A{
    A(int a, int b){
        System.out.println("Class A: " + (a + b));
    }
    void show(){
        System.out.println("Show A Class");
    }
}

class B extends A{
    B(int a , int b){
        super(a, b);
        System.out.println("Class B: " + (a + b + 20));
    }
    void show(){
        super.show();
        System.out.println("Show B Class");
    }
}

class C extends B{
    C(int a , int b){
        super(a, b);
        System.out.println("Class C: " + (a + b + 30));
    }
    void show(){
        super.show();
        System.out.println("Show C Class");
    }
}
