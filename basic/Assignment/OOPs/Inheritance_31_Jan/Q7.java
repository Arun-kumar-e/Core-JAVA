class Employee {
    void nameOfEmployee () {
        System.out.println("Employee");
    }  
}

class Manager extends Employee {
    void nameOfManager () {
        System.out.println("Manager");
    }
}

class Executive extends Manager {
    void nameOfExecutive () {
        System.out.println("Executive");
    }
}
public class Q7 {
    public static void main(String[] args) {
        Executive e = new Executive ();
        e.nameOfEmployee ();
        e.nameOfManager ();
        e.nameOfExecutive ();
    }
}
