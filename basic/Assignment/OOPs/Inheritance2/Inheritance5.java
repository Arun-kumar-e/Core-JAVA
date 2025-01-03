public class Inheritance5 {
    
    public static void main(String[] args) {
        
        Manager m = new Manager();
        m.setManagerDetails("John", 101, "HR");
        m.displayManagerDetails();

        System.out.println();

        Executive e = new Executive();
        e.setExecutiveDetails("John", 101, "HR", 5000);
        e.displayExecutiveDetails();


    }
}

class Employee {
    String name;
    int id;


    void setEmployeeDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employee {
    String department;


    void setManagerDetails(String name, int id, String department) {
        setEmployeeDetails(name, id); 
        this.department = department;
    }

    void displayManagerDetails() {
        displayEmployeeDetails(); 
        System.out.println("Department: " + department);
    }
}

class Executive extends Manager {
    int bonus;

    void setExecutiveDetails(String name, int id, String department, int bonus) {
        setManagerDetails(name, id, department); 
        this.bonus = bonus;
    }

    void displayExecutiveDetails() {
        displayManagerDetails();
        System.out.println("Bonus: " + bonus);
    }
}


