public class Inheritance7 {
    
    public static void main(String[] args) {
        
        Par p = new Par();
        p.show3();
    }
}

class Par{

    void show(){
        System.out.println("Method Call using Method chaning ");
    }

    void show1(){
        this.show();
    }

    void show2(){
        show1();
    }

    void show3(){
        show2();
    }
}
