public class Person {
    
    public static void main(String[] args) {
        

        pers p1 = new pers();
        p1.set("Rahul", 20);
        System.out.println(p1.geta1());
        System.out.println(p1.geta2());
    }
}

class pers{

    private String name;
    private int age;
    
    void set(String name, int age){
        this.name = name;
        this.age = age;
    }

    String geta1(){
        return name;
    }

    int geta2(){
        return age;
    }
}

