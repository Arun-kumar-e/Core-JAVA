import java.util.Scanner;

public class InstanceVariable {
    
    public static void main(String[] args) {
        
        A obj = new A(48);
        obj.show();
    }
}

class A{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    A(int p){
        a = p;
        System.out.println(a);
    }
    void show(){
        System.out.println(a);


    }
}
