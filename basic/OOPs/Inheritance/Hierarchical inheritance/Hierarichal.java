class A{
    void show1(){
        System.out.println("Show1 of A");
    }

}

class B extends A{
    void show2(){
        System.out.println("Show2 of B");
    }
}

class C extends A{
    void show3(){
        System.out.println("Show3 of C");
    }
}

public class Hierarichal {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show1();
        obj1.show2();

        System.out.println();
        
        C obj2 = new C();
        obj2.show1();
        obj2.show3();
    }
}