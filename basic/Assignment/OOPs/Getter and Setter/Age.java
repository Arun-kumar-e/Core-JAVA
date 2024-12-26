public class Age {
    
    public static void main(String[] args) {
        
        agee a1 = new agee();
        a1.set(20);
        System.out.println("Age of person is "+a1.get1());

    }
}

class agee{

    private int age;

    void set(int age){
        this.age = age;
    }

    int get1(){
        if (age < 0 || age > 130){
            System.out.println("Age can not be negative");
            return 0;
        }

        return age;
    }

}
