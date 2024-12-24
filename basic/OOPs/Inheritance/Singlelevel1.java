public class Singlelevel1 {
    
    public static void main(String[] args) {
        
        Ent o = new Ent();
        o.show3();
        o.show();
        o.show2(10);



    }
}

class Par{

    void show(){
        System.out.println("hello from clsss par");
    }

    int show2(int a){
        return a;
    }
}

class Ent extends Par{
    void show3(){
        System.out.println("hello from clsss ent");
    }
}
