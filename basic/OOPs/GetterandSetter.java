public class GetterandSetter {
    public static void main(String[] args) {

        // As obj = new As();
        // obj.showw(10);
        // System.out.println(obj.show1());

        Addd obj1 = new Addd();
        obj1.show(10,20);
        System.out.println(obj1.show1());
        System.out.println(obj1.show2());
        obj1.add();
       
    }
}

class As{
    int a ;

    void showw(int a){
        this.a = a;
    }

    int show1(){
        return a;
    }
}

// Add two numbers using getter and setter
class Addd{
    int c;
    int b;

    void show(int c, int b){
        this.c = c;
        this.b = b;
    }

    int show1(){
        return c;
    }

    int show2(){
        return b;
    }

    void add(){
        int d = c + b;
        System.out.println("Sum of " + c + " and " + b + " is " + d);
    }
}