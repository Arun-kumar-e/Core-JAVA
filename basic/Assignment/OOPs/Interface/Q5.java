class A5{
    final void show(){
        System.out.println("Ok");
    }
}
class B5 extends A5{
    void show2(){
        show(); //can access
    }

    // final void show(){ // can not overrida aka no modification
    //     System.out.println("Bye");
    // }
}

public class Q5 {
    public static void main(String[] args) {
        B5 obj = new B5();
        obj.show2();
    }  
}
