import java.util.Scanner;
public class Employeee {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Emplooyee e1 = new Emplooyee();
        double salary = sc.nextDouble();
        e1.set(salary);
        System.out.println(e1.geta1());

        sc.close();

    }
}

class Emplooyee{

    private Double salary;

    void set(Double salary){
        if (salary < 0){
            System.out.println("Salary cannot be negative");
            this.salary = 0.0;          
        }else {
            this.salary = salary;
         }
    }

    Double geta1(){
        return salary;
    }
}
