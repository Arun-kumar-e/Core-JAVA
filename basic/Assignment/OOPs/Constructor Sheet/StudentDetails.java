public class StudentDetails {
    
    public static void main(String[] args) {
        
        Studentss s = new Studentss();
        s.display();
    }
}

class Studentss{
    
    String name;
    int marks;
    
    public Studentss() {
        name = "unknown";
        marks = 0;
    }
    
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+ marks);
    }
}
