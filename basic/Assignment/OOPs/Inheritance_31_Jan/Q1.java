class Person{
    String name;
    void display(String name){
        System.out.println(name);
    }
}

class Student extends Person{
    int roll;
    void display(int roll){
        System.out.println(roll);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display("John");
        s.display(101);
    }
}