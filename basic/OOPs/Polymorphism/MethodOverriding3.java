public class MethodOverriding3 {
    
    public static void main(String[] args) {
        
        B obj = new B();
        obj.show(10);
        obj.show();

        // D obj1 = new D();
        // obj1.show();

    }
}

class A{ 

    //Same class name and same method name but different Argument .
    void show( int a ){ 
        System.out.println(a); 
    } 
} 
class B extends A{ 
    void show(){ 
        System.out.println("B"); 
    } 
}

// Same class name and same method name but with return type
// class c {

//     void show(){
//         System.out.println("C");
//     }
// }

// class D extends c{

//     int show(){
//         int a = 10;
//         System.out.println("D");
//         return a;
//     }
// }