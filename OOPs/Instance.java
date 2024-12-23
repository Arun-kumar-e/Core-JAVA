class A{

    int a;

    void show(){
        System.out.println(a);
    }
}
public class Instance {
    
    public static void main(String[] args) {

        A obj = new A();
        obj.show();
    }
}
