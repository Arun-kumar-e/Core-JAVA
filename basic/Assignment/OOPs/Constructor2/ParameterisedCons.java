class Adds{
    Adds(int a,int b){
        int c=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+c);
    }
}

class Subs{
    Subs(int a,int b){
        int c=a-b;
        System.out.println("Subtraction of "+a+" and "+b+" is "+c);
    }
}

class Muls{
    Muls(int a,int b){
        int c=a*b;
        System.out.println("Multiplication of "+a+" and "+b+" is "+c);
    }
}

class Divs{
    Divs(int a,int b){
        int c=a/b;
        System.out.println("Division of "+a+" and "+b+" is "+c);
    }
}
public class ParameterisedCons {
    
    public static void main(String[] args) {
        
        new Adds(10,20);
        new Subs(30,10);
        new Muls(50,10);
        new Divs(100,10);
       
    }
}


