class Primtive_data_type{
    char print(){
        char ch = 'a';
        return ch;
    }

    int print1(){
        int a = 10;
        return a;
    }

    float print2(){
        float f = 10.5f;
        return f;
    }

    double print3(){
        double d = 10.5;
        return d;
    }

    boolean print4(){
        boolean b = true;
        return b;
    }

    byte print5(){
        byte b = 10;
        return b;
    }

    short print6(){ 
        short s = 10;    
        return s;
    }

    long print7(){
        long l = 10;
        return l;
    }

}
public class PrimtiveDT {
    
    public static void main(String[] args) {

        Primtive_data_type obj = new Primtive_data_type();
        char ch = obj.print();
        int a = obj.print1();
        float f = obj.print2(); 
        double d = obj.print3();
        boolean b = obj.print4();
        byte b1 = obj.print5();
        short s = obj.print6();
        long l = obj.print7();
        System.out.println("Char: "+ch);
        System.out.println("Int: "+a);        
        System.out.println("Float: "+f);
        System.out.println("Double: "+d);
        System.out.println("Boolean: "+b);
        System.out.println("Byte: "+b1);        
        System.out.println("Short: "+s);
        System.out.println("Long: "+l);
    }
}
