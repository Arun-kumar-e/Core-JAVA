public class Q3 {

    public static void main(String[] args) {

        B obj = new B();
        obj.show(10);   
        obj.show();
    }
}

class A {

    void show(int a) {
        System.out.println("class A"+a);
    }

}

class B extends A {

    void show() {
        System.out.println("class B");
    }
}

