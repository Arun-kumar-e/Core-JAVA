public class Rectanglee {
    
    public static void main(String[] args) {
        
        Rect r1 = new Rect();
        r1.set(10.0, 20.0);
        System.out.println("Length of rectangle is "+r1.get1());
        System.out.println("Width of rectangle is "+r1.get2());
        System.out.println("Area of rectangle is "+r1.area());
    }
}

class Rect{

    private Double l;
    private Double b;

    void set(Double l, Double b){
        this.l = l;
        this.b = b;
    }

    Double get1(){
        return l;
    }
    Double get2(){
        return b;
    }
    Double area(){
        return l*b;
    }
}
