public class Inheritance5 {
    
    public static void main(String[] args) {
        
        B b = new B();
        b.set(10, 20);
        b.set1(30, 40);
        b.sum();
        b.sub();

    }
}

class A{

    private int n1, n2;

    void set(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    int getN1(){
        return n1;
    }

    int getN2(){
        return n2;
    }

    void sum(){
        System.out.println("Sum: " + (n1 + n2));
    }

}

class B extends A{

    private int n3, n4;

    void set1(int n3, int n4){
        this.n3 = n3;
        this.n4 = n4;
    }

    int getN3(){
        return n3;
    }

    int getN4(){
        return n4;
    }

    void sub(){
        System.out.println("Subtraction: " + (n3 - n4));
    }

}
    
