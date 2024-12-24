public class StudentInfo {
    
    public static void main(String[] args) {
        
        Student Stu = new Student();
        Stu.display();
    }
}

class Student {

    String name;
    int marks;

    Student(){
        name = "Unknown";
        marks = 0;
    }

    void display(){ 
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
