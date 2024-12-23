// Return and no argument

// Primetive data types
class A {
    char print(){
        char a = 'a';
        return a;
    }
}


// String    return and no argument
class Strings {
    String print(){

         String a = "Hello";
         return a;     

    }    
}

//covariant return type
class Covariant{
    Covariant show(){
        System.out.println("Hello World");
        return this;
    }
}

public class OOPs2 {
    public static void main(String[] args) {

        A obj = new A();
        char c = obj.print();
        System.out.println(c);


        Strings S = new Strings();
        String s = S.print();
        System.out.println(s);


       Covariant A = new Covariant();
       A.show();
    }
}
