public class Arch {

    public static void main(String[] args) {
        
        A a = new A();
        System.out.println(a.show(4));
       
    }

}

class A{

    int a = 10;
    int show(a){
        this.a = a;
        // System.out.println("A");
        return this.a;
    }
}