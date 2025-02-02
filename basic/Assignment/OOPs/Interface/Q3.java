interface A3{
    void show();
}
interface B3{
    void show();
}
interface C3{
    void show();
}
interface D3{
    void show();
}
class E3 implements A3,B3,C3,D3{
    public void show(){
        System.out.println("Its overridden for all same namem method in all interface");
    }
}

public class Q3 {
    public static void main(String[] args) {
        E3 obj = new E3();
        obj.show();
    } 
}
