public class Question1 {

    public static void main(String[] args) {

        Student student = new Student();
        student.setter("Aditya", 1, 'A');        

        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Grade: " + student.getGrade());

        System.out.println("\nAfter Modification \n");

        Student student1 = new Student();
        student1.setter("Arun", 2, 'B');        

        System.out.println("Name: " + student1.getName());
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Grade: " + student1.getGrade());
        

       
    }

}

class Student {

    private String name;
    private int rollN;
    private char grade;

    void setter(String name, int rollN, char grade) {
        this.name = name;
        this.rollN = rollN;
        this.grade = grade;
    }

    String getName() {
        return name;
    }

    int getRollNumber() {
        return rollN;
    }

    char getGrade() {
        return grade;
    }

}