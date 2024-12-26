class A{

    void show(byte a){
        System.out.println("byte "+a);
    }

    //method overloading is possible by changing the data type of the argument
    void show(int a, String b){
        System.out.println("int "+ a);
    }

    void show(String b , int a){
        System.out.println("int "+ a);
    }
    void show(float a){
        System.out.println("Float "+ a);
    }

    void show(double a){
        System.out.println("Double "+ a);
    }
    
}


public class MethodOverloadingg {

    public static void main(String[] args) {

        A obj = new A();
        obj.show((byte)12);
        obj.show(5);
        obj.show(555.22f);
        obj.show(444.11);
    }
}

