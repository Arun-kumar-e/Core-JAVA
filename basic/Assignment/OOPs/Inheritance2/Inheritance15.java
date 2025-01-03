public class Inheritance15 {
    
    public static void main(String[] args) {

        student s = new student();
        s.display();

        teacher t = new teacher();
        t.display();

    }
}

class person {

    void display() {
        System.out.println("This is person class");
    }
}

class student extends person {

    void display() {
        System.out.println("This is student class");
    }
}

class teacher extends person {

    void display() {
        System.out.println("This is teacher class");
    }
}


