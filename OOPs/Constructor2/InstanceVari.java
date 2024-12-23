class Addition {
    int a = 100;
    int b = 242;

    void add() {
        int c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }
}
public class InstanceVari {
    
    public static void main(String[] args) {
        
        Addition obj = new Addition();
        obj.add();
    }
}
