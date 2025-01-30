public class Interface3 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}

interface A {
    int a = 12;
}

interface B extends A {
    //a = 13;  cannot reassign value to a constant (they are by )
}

class C implements B {
    public void show() {
        System.out.println(A.a);
    }
}
