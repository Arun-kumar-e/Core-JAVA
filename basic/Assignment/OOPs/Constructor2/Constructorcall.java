public class Constructorcall {

    public static void main(String[] args) {
        
        Constrr O = new Constrr();
        O.NoRetandNoArg();
        System.out.println(O.RetandArg("Argument"));
        System.out.println(O.RetandNoArg());

        System.out.println();
        System.out.println();

        new Constrr().NoRetandNoArg();
        System.out.println(new Constrr().RetandArg("Argument"));
        System.out.println(new Constrr().RetandNoArg());
    }
}

class Constrr{
    Constrr(){

    }

    void NoRetandNoArg(){
        System.out.println("No Return and No Argument");
    }

    String RetandArg(String s){
       return "Return and " + s;
    }

    String RetandNoArg(){
        return "Return and No Argument";
    }
}
