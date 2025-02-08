class  Building{
    void m1(){
        System.out.println("Building class");
    }
}

class House extends Building{
    void m2(){
        System.out.println("House class");
    }
}

class Mansion extends House{
    void m3(){
        System.out.println("Mansion class");
    }
}

public class Q11 {
    public static void main(String[] args) {
        Mansion m = new Mansion();
        m.m1();
        m.m2();
        m.m3();
    }    
}
