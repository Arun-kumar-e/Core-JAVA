class Temperature {

    // temperature(flaot c) {
    //     System.out.println("Temperature is 98.6");
    // }

    static void tempconvert(float c) {
        float f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + f);
    }
}
public class Q11 {
    public static void main(String[] args) {
        Temperature.tempconvert(37);
    }
}
