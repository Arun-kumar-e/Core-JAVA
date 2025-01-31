public class Static2 {
    
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.display();
    }
}

class A {
    void show(){
        System.out.println("Non-static method");
    }
    static void display(){
        System.out.println("Static method");
    }
}
