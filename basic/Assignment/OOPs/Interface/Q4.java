interface A4{
    int a = 34; // its by default public and final
}
class B4 implements A4{
    public void show(){
        System.out.println(a); // accessble
        // a = 3; // throw Error - can not reaassign final variable
        // System.out.println(a); 
    }
}
public class Q4 {
    public static void main(String[] args) {
        B4 obj = new B4();
        obj.show();
    }   
}
