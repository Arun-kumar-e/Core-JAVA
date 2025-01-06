public class MethodOverHiding {
    
    public static void main(String[] args) {
        
        B obj = new B();
        obj.display();

    }
}

class A{

    static void display(){
        System.out.println("Method Overhiding");
    }
}

class B extends A{

    static void display(){
        System.out.println("Method Overhiding");
    }
}

