public class Q4 {
    
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        
    }
}

// Error because B doesn't have a same return type as A's show method

class A {

    int show(){
        int a = 10;
        System.out.println("Class A");
        return a;
    }
}

class B extends A {

    void show(){
        System.out.println("Class B");
    }
}
