public class GetterandSetter {
    
    public static void main(String[] args) {
        
        B b = new B();
        b.setA("Class b");
        b.display();

        System.out.println();

        C c = new C();
        c.setA("Class c"); 
        c.display();

        System.out.println();

        D d = new D();
        d.setA("Class d");  
        d.display();


    }
}

class A{

    private String a;

    String getA() {
        return a;
    }

    void setA(String a) {
        this.a = a;
    }

}

class B extends A{

    void display(){
        System.out.println("Value of a is "+getA()+ " using getter and setter method");
    }
}

class C extends A{

    void display(){
        System.out.println("Value of a is "+ getA()+ " without using getter and setter method");
    }
}

class D extends A{

    void display(){
        System.out.println("Value of a is "+ getA()+ " without using getter and setter method");
    }
} 
