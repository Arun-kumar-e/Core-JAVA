public class EmployeeeDetail {
    
    public static void main(String[] args) {
        
        Employeee e = new Employeee("John", 50000);
        
        e.display();
    }
}

class Employeee{

    String name;
    int Salary;

    Employeee(String name, int Salary){
        this.name = name;
        this.Salary = Salary;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+Salary);
    }
}
