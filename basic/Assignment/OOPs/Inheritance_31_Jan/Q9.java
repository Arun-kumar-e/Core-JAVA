class Person {
    void message() {
        System.out.println("This is person class");
    }
}

class Student extends Person {
    void messageofStudent() {
        System.out.println("This is student class");
    }
}

class GraduateStudent extends Student {
    void messageofGrafStudent() {
        System.out.println("This is graduate student class");
    }
}
public class Q9 {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.message();
        gs.messageofStudent();
        gs.messageofGrafStudent();
    }
}
