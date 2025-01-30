public class Interface1 {

    public static void main(String[] args) {

        C obj = new C();
        obj.show();
        obj.display();
       
    }
}

interface A {
    void show();
}

interface B extends A {
    void display();    
}

class C implements B {
    public void show() {
        System.out.println("Show");
    }
    
    public void display() {
        System.out.println("Display");
    }
}

