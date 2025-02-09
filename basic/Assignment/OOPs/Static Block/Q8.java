class A{
    static {
        System.out.println("Static Block one");
    }

    static {
        System.out.println("Static Block two");
    }

    static {
        System.out.println("Static Block three");
    }

    static {
        System.out.println("Static Block four");
    }
}
public class Q8 {
    static {
        System.out.println("Static Block five");
    }
    public static void main(String[] args) {
        A a = new A();
    }
}
