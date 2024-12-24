public class EmployeeInfo {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee(101);
        emp.display();
    }
}

class Employee{

    int id;

    Employee(int id){
        this.id = id;
    }

    void display(){
        System.out.println("ID: " + id);
    }
}
