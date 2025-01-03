public class Q3 {
    
    public static void main(String[] args) {
        
        new A(10);
    }
}

class A{

    A(){
        this(15.51f , 15.55f);
        System.out.println("Constructor 1");
        
    }

    A(int a){
        this((double)1555555);
        System.out.println("Constructor 2");
        
    }

    A(int a ,  int b){
        System.out.println("Constructor 3");
    }

    A(float a){
        this(15 , 55);
        System.out.println("Constructor 4");
        
    }

    A(float a , float b){
        this(15.5f);
        System.out.println("Constructor 5");
        
    }

    A(double a){     
        this();
        System.out.println("Constructor 6");
    }

}


