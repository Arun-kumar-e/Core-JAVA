public class InstanceVariable {
    
    public static void main(String[] args) {
        
        B obj = new B();
        obj.display();

    }
}

class A{

    int a = 10;

}

class B extends A{

    void display(){
        System.out.println("Instance variable a from class A: " + a);
    }

}
