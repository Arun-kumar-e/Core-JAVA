public class arithmetic15 {
    public static void main(String[] args) {
        //3.4+1.2*(3.7-1.2)/2+6.8
        float a = 3.4f;
        float b = 1.2f;
        float c = 3.7f;
        float d = 1.2f;
        float e = 2;
        float f = 6.8f;
        float g = a + b * (c - d) / e + f;
        System.out.println("3.4+1.2*(3.7-1.2)/2+6.8 is " + g);
    }
}
