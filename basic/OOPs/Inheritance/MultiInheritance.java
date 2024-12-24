public class MultiInheritance {
    
    public static void main(String[] args) {
     
        Third Child = new Third();
        Child.show();
        Child.show1();
        Child.show2();
    }
}

class Frist{

    void show(){
        System.out.println("hello from clsss frist");
    }
}

class Second extends Frist{

    void show1(){    
        System.out.println("hello from clsss second");
    }
}

class Third extends Second{

    void show2(){    
        System.out.println("hello from clsss third");
    }
}