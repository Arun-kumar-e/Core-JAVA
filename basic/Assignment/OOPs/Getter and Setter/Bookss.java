public class Bookss {
    
    public static void main(String[] args) {
        
        Boook b1 = new Boook();
        b1.set(100.564);
        System.out.println(b1.geta1());

    }
}

class Boook{

    private Double price;

    void set(Double price){
        this.price = price;
    }

    Double geta1(){
        return price;
    }
}
