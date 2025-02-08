class person {
    void m1(){
        System.out.println("Person is walking");
    }
}

class Student extends person{
    void m1(){
        System.out.println("Student is walking");
    }
}

class Employee extends person{
    void m1(){
        System.out.println("Employee is walking");
    }
}
public class Q14 {
    public static void main(String[] args) {
        Student s = new Student();
        s.m1();
        Employee e = new Employee();
        e.m1();
    }
}
