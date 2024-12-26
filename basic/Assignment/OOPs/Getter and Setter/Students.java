public class Students {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.set("Rahul", 20);
        System.out.println(s1.geta1());
        System.out.println(s1.geta2());

    }
}

class Student{

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
