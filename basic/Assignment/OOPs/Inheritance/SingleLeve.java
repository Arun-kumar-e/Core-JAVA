public class SingleLeve {
    public static void main(String[] args) {

       
        B b = new B();
        b.show();
        b.show(100);
        b.show1();
        b.show2("hello");
    }
}

class A {

    void show() {
        System.out.println("no return and no argument");
    }

    void show(int a) {

        System.out.println("no return and with argument " + a);
    }

}

class B extends A {

    int show1() {
        System.out.println("with return and no argument");
        return 0;
    }

    String show2(String s) {
        System.out.println("with return and with argument");
        return s;
    }

}