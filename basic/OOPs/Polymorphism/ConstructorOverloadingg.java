public class ConstructorOverloadingg {
    
    public static void main(String[] args) {

          new B();
          new B(5);
    }
}

class B{

    // Constructor overloading 
    // B(){
    // }
    // B(){
    // }

    //Solution

    B(){
        System.out.println("Default Constructor");
    }

    B(int a){
        System.out.println("Parameterized Constructor");
    }
}
