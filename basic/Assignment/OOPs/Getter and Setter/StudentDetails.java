public class StudentDetails {
    
    public static void main(String[] args) {
        
        Stud s1 = new Stud();
        s1.set("Rahul", 10);
        System.out.println(s1.get1());
        System.out.println(s1.get2());
    }
}

class Stud{
    
    private String name;
    private Integer marks;
    
    void set(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    
    String get1(){
        return name;
    }
    
    int get2(){
        if (marks < 0){
            System.out.println("Marks can not be negative");
            return 0;
        }

        return marks;
    }


}
