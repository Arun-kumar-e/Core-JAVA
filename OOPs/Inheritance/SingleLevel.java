package Inheritance;

public class SingleLevel {
    
    public static void main(String[] args) {

        Singlee obj = new Singlee();
        obj.show();
        obj.show1();

    }
}

class Singl{
    void show(){
        System.out.println("hello from clsss singl");
    }
}

 class  Singlee extends Singl{
    void show1(){
        System.out.println("hello from clsss singlee");
    }
}
