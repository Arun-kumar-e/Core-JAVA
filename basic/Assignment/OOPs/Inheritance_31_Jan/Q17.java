class Person{
    void role(){
        System.out.println("Person is a person");
    }
}

class Student extends Person{
    void role(){
        System.out.println("Student is a student");
    }
}

class Teacher extends Person{
    void role(){
        System.out.println("Teacher is a teacher");
    }
}
public class Q17 {
    public static void main(String[] args) {
        Student s = new Student();
        s.role();
        Teacher t = new Teacher();
        t.role();
    }
}
