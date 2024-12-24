public class SamepParameterised {
    
    public static void main(String[] args) {
        
        SamepPara obj = new SamepPara(10, 5);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}

class SamepPara {

    int num1, num2;
    
    SamepPara(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void add(){
        System.out.println("Sum: " + (num1 + num2));
    }

    void sub(){
        System.out.println("Sub: " + (num1 - num2));
    }

    void mul(){
        System.out.println("Mul: " + (num1 * num2));
    }

    void div(){
        System.out.println("Div: " + (num1 / num2));
    }

}
