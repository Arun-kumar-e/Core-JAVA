public class PublicInstanceVariable{

    
    public static void main(String[] args){
        
        B obj = new B();
        obj.display();
    }
}

class A{

    public int a = 10;

}

class B extends A{

    void display(){
        System.out.println("Public variable a is: "+a);
    }

}
