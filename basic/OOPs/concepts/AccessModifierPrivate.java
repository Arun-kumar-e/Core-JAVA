public class AccessModifierPrivate {
    
    public static void main(String[] args) {
        
        B obj = new B();
        obj.display4();
        obj.display3();
    }
}

class A{

    private void display(){
        System.out.println("Access Modifier Private");
    }

    void display4(){
        display();
    }

}

class B extends A{
    private void display2(){
        System.out.println("Access Modifier Private");
    }

    

    void display3(){
        display2();
    }
}
