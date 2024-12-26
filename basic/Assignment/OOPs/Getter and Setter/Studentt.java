public class Studentt {
    
    public static void main(String[] args) {
        
        Studd s1 = new Studd();

        System.out.println("Default Marks " + s1.getMarks());
        
        s1.setMarks(100);
        System.out.println("Marks after setting "+s1.getMarks());
        
        
    }
}

class Studd{

    private int marks;

    void setMarks(int marks){
        this.marks = marks;
    }

    int getMarks(){
        if (marks < 0){
            System.out.println("Marks can not be negative");
            return 0;   
        }
        return marks;
    }
}
