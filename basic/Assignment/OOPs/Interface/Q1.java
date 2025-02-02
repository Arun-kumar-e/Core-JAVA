interface A{
    int sum(int a, int b);
}
interface B{
    void show(String s);
}
interface C{
    String show1();
}
interface D extends A,B,C{
    void m4();
}
class E implements D{
    public int sum(int a, int b){
        return a+b;
    }
    public void show(String s){
        System.out.println(s);
    }
    public String show1(){
        return "Emilia Parez is a bad movie.";
    }
    public void m4(){
        System.out.println("13 oscar nominations for what??");
    }
}

public class Q1{
    public static void main(String []args){
        E obj = new E();
        System.out.println(obj.sum(10,15));
        obj.show("Yo Boi!");
        System.out.println(obj.show1());
        obj.m4();
    }
}