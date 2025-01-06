public class AccessModifierPublic {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.display2();
    }
}

class A{

    public void display(){
        System.out.println("Access Modifier Public");
    }

}

class B extends A{

    public void display2(){
        System.out.println("Access Modifier Public");
    }
}

     