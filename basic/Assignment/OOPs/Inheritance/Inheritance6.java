public class Inheritance6 {
    
    public static void main(String[] args) {
        
        Cot c = new Cot();
        c.print1();
        c.print2(10);
        c.print3();
        c.display();
        c.show();
    }
}

class Sin{

    void show(){
        System.out.println("Show method of Sin class");
    }

}

class Cos extends Sin{

    void display(){
        System.out.println("Display method of Cos class");
    }

}

class Tan extends Cos{

    void print1(){
       Sin s = new Sin();
         s.show();
    }

    int print2(int a){
        
        System.out.println("Return and Argument method of Tan class");
        return a;
    }
}

class Cot extends Tan{

    void print3(){
        Cos c = new Cos();
        c.display();
    }

}


