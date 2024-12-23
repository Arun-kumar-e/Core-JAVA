class Stri{

    String show(String a){
        return a;
    }
}

class Conva{
    Conva show1(String b){
        System.out.println(b);
        return this;
    }
}
public class Cons1 {
    
    public static void main(String[] args) {
        
        Stri s = new Stri();
        System.out.println(s.show("Hello "));
        Conva c = new Conva();
        c.show1("Welcome to India");
        
    }
}
