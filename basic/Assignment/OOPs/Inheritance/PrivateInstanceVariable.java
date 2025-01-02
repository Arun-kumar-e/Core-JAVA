public class PrivateInstanceVariable {
    
    public static void main(String[] args) {
        
        B obj = new B();
        obj.display();

    }
}

class A{

    private int a ;

    void setA(int a){
        this.a = a;
    }
    
    int getA(){
        return a;
    }

}

class B extends A{

    void display(){
        setA(45);
        System.out.println("Private variable a is: "+getA());
    }

   

}

