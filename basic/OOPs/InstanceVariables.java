public class InstanceVariables {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show(48);
    }
}

class A {
    int a ;
    void show(int a) {
        this.a = a;
        System.out.println(a);
    }
}
