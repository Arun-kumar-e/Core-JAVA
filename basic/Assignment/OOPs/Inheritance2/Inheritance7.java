public class Inheritance7 {
    
    public static void main(String[] args) {
        
        student s = new student();
        s.setStudentDetails("John", 101, 80);
        s.displayStudentDetails();

        System.out.println();

        teacher t = new teacher();
        t.setTeacherDetails("John", 101, 2025);
        t.displayTeacherDetails();

    }
}

class person {

    String name;
    int id;

    void setPersonDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

}

class student extends person {

    int marks;

    void setStudentDetails(String name, int id, int marks) {
        setPersonDetails(name, id);
        this.marks = marks;
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
    }

}

class teacher extends person {

    int Gradutedyear;

    void setTeacherDetails(String name, int id, int Gradutedyear) {
        setPersonDetails(name, id);
        this.Gradutedyear = Gradutedyear;
    }

    void displayTeacherDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GradutedYear: " + Gradutedyear);
    }
    

}


