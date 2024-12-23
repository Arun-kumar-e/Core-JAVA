class Con{
    Con (){
    }

    void show(){
        System.out.println("no return and no argument");
    }

    int show(int a){
        System.out.println(" return and argument");
        return  a;
    }

    int show1(){
        System.out.println("no return and argument");
        int a = 10;
        return a;
    }
} 

public class Constructorss {
    
    public static void main(String[] args) {
        
        Con obj = new Con();
        obj.show();
        System.out.println(obj.show(10));
        System.out.println(obj.show1());
    }
}
