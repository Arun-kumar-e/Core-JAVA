interface A{
    default int M1(int a){
        System.out.println("M1 "+ a);
        M2();
        return a;
    }
    private void M2(){
        System.out.println("M2");
    }

    interface B{
        default int M3(int a){
            System.out.println("M3 "+ a);
            M4();
            return a;
        }

        private int M4(){
            System.out.println("M4");
            return 0;
        }
    }
}

class C implements A,A.B{
}
public class Q4 {
    public static void main(String[] args) {
        C c = new C();
        c.M1(1);
        c.M3(2);
    }
}
