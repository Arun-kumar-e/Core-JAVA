/*
 * Create a program where a Person class is inherited by both Employee and Student classes, and demonstrate how each subclass can have its own unique methods.

 */
public class Inheritance12 {

    public static void main(String[] args) {
        
        Employee e = new Employee();
        e.display();
        e.employeedisplay();

        System.out.println();

        Student s = new Student();
        s.display();
        s.Studentdisplay();

    }
}

class Person {
    void display() {
        System.out.println("Person class");
    }
}

class Employee extends Person {
    void employeedisplay() {
        System.out.println("Employee class");
    }
}

class Student extends Person {
    void Studentdisplay() {
        System.out.println("Student class");
    }
}




