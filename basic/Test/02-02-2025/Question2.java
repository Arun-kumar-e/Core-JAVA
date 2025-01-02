import java.util.Scanner;

public class Question2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        
        Employee employee = new Employee();
        employee.setSalary(salary);
        System.out.println("Salary: " + employee.getSalary());

        sc.close();
    }
}

class Employee {
    
    
    private double salary;

    void setSalary(double salary) {
        if(salary < 0) {
            System.out.println("Salary cannot be negative");
            
        } else {
            this.salary = salary;
        }
    }
    
    double getSalary() {
        return salary;
    }
    
}
