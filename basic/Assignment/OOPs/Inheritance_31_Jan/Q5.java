class A{
    private String name = "Arun";
    String getName(){
        return name;
    }
}

class B extends A{
    void setName(){
        System.out.println("Name is: "+ getName());
    }
}
public class Q5 {
    public static void main(String[] args) {
        B b = new B();
        b.setName();
    }
}
