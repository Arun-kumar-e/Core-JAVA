/*
 * Write a Java program to demonstrate single-level inheritance where a Student class inherits from a Person class.
 */
public class Inheritance1 {

    public static void main(String[] args) {
        
        Student s = new Student();
        s.name("John");
        s.rollNo(101);
        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNo);

    }
}

class Person {

    String name;
    
    void name(String name) {
        this.name = name;
    }

}

class Student extends Person {

    int rollNo;

    void rollNo(int rollNo) {
        this.rollNo = rollNo;
    }

}

