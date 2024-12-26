public class Inheritance2 {
    
    public static void main(String[] args) {
        
        Subtraction s = new Subtraction();
        s.add();
        s.subtract();

    }
}

class Addition{

    int a = 100;
    int b = 545;

    void add(){
        System.out.println("Addition is: " + (a + b));
    }

}


class Subtraction extends Addition{   

    int c = 1000;
    int d = 500;
    
    void subtract(){
        System.out.println("Subtraction is: " + (c - d));
    }
}