class A{
    static void m1(){
        System.out.println("Static Method one");
    }

    static void m2(){
        System.out.println("Static Method two");
    }

    static void m3(){
        System.out.println("Static Method three");
    }

    static void m4(){
        System.out.println("Static Method four");
    }

    static{
        System.out.println("Static Block one");
    }
    static{
        System.out.println("Static Block Two");
    }
}
public class Q9 {
    public static void main(String[] args) {
        A.m1();
        A.m2();
        A.m3();
        A.m4();
    }
}
