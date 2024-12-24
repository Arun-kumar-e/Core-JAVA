public class Rectangle {
    
    public static void main(String[] args) {
        
        RectangleSides rec = new RectangleSides(10, 20);
        rec.display();
    }
}

class RectangleSides{

    int len;
    int bre;

    RectangleSides(int len , int bre){
        this.bre = bre;
        this.len = len;
    }

    void display(){
        System.out.println("Length: " + len);
        System.out.println("Breadth: " + bre);
    }
}
