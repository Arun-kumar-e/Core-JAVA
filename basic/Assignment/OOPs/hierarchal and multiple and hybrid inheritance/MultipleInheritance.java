public class MultipleInheritance {
    
    public static void main(String[] args) {
        

    }
}

class A{

    void display(){
        System.out.println("Class A");
    }

}

class B {

    void display(){
        System.out.println("Class B");
    }

}

class C extends A, B{

    void display(){
        System.out.println("Class C");
    }

}
