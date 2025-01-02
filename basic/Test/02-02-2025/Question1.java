public class Question1 {

    public static void main(String[] args) {

        Student student = new Student("John", 1, 'A');

        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Grade: " + student.getGrade());

        System.out.println("\nAfter Modification \n");

        student.setName("Doe");
        student.setRollNumber(2);
        student.setGrade('B');

        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Grade: " + student.getGrade());
    }

}

class Student {

    private String name;
    private int rollN;
    private char grade;

    Student(String name, int rollN, char grade) {
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

    void setName(String name) {
        this.name = name;
    }

    void setRollNumber(int rollN) {
        this.rollN = rollN;
    }

    void setGrade(char grade) {
        this.grade = grade;
    }
}